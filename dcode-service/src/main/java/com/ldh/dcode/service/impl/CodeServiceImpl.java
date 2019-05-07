package com.ldh.dcode.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.dcode.comm.enums.SegmentTypeEnum;
import com.ldh.dcode.dao.CodeDao;
import com.ldh.dcode.dao.OptionDao;
import com.ldh.dcode.entity.CodeDetail;
import com.ldh.dcode.entity.Flow;
import com.ldh.dcode.entity.OptionDetail;
import com.ldh.dcode.service.CodeService;

/**
 * 
 * @author Li Dehuan
 * @date 2019年5月5日
 *
 */
@Service("CodeService")
public class CodeServiceImpl implements CodeService {

	@Resource
	CodeDao codeDao;
	
	@Resource
	OptionDao optionDao;
	
	
	/*
	 * 获取编码
	 * @see com.ldh.dcode.service.DCodeService#getFlowNo(java.lang.String, java.util.Map)
	 * 2019年5月6日
	 */
	@Override
	public String getCode(String codeKey, Map<String, Object> params) {
		
		String flow_key = codeKey;	//流水标识
		
		StringBuilder code = new StringBuilder();	//编码
		
		List<CodeDetail> list = codeDao.queryCodeDetails(codeKey);
		
		for(CodeDetail codeDetail : list){
			
			//1：固定值
			if(SegmentTypeEnum.FIXED.getCode().equals(codeDetail.getSegmentType())){
				
				code.append(codeDetail.getSegValue());	// 取固定值
			} 
			
			//2：关联属性
			else if(SegmentTypeEnum.OPTION.getCode().equals(codeDetail.getSegmentType())){
				
				List<OptionDetail> details = optionDao.queryOptionDetail(codeDetail.getOptionKey());
				
				for(OptionDetail detail : details){
					
					if(detail.getPropertyVal().equals(params.get(detail.getProperty()))){
						code.append(detail.getCodeVal());
						
						//判断日期是否影响流水
						if(codeDetail.getAffectFlow() == 1){
							flow_key += "::" + detail.getCodeVal();
						}
						
						break;
					}
				}

			}
			
			//3：日期
			else if(SegmentTypeEnum.DATE.getCode().equals(codeDetail.getSegmentType())){
				
				SimpleDateFormat sdf = new SimpleDateFormat(codeDetail.getFormat());
				
				String fvalue = sdf.format(new Date());
				code.append(fvalue);
				
				//判断日期是否影响流水
				if(codeDetail.getAffectFlow() == 1){
					flow_key += "::" + codeDetail.getFormat() + "=" + fvalue;
				}
			}
			
			//4：流水
			else if(SegmentTypeEnum.FLOW.getCode().equals(codeDetail.getSegmentType())){
				StringBuilder flowSb = new StringBuilder("");
				
				Integer flowNo = this.getFlowNo(flow_key);
				
				int dif = codeDetail.getLength() - flowNo.toString().length();
				
				if(dif < 0){
					throw new RuntimeException("流水号长度超过规定长度：" + codeDetail.getLength());
				}
				
				for(int i = 0; i < dif; i++){
					flowSb.append("0");
				}
				
				flowSb.append(flowNo);
				
				code.append(flowSb);
			}
		}
		
		return code.toString();
	}


	
	/*
	 * 获取流水号
	 * @see com.ldh.dcode.service.CodeService#getFlowNo(java.lang.String)
	 * 2019年5月6日
	 */
	@Override
	public Integer getFlowNo(String flowKey) {
		
		int flowNo = 0;
		
		Flow flow = codeDao.queryFlowByPK(flowKey);
		
		if(flow == null){
			flow = new Flow();
			flow.setFlowKey(flowKey);
			flow.setNowNo(0);
			flow.setNextNo(1);
			int ires = codeDao.insertFlow(flow);
			
			if(ires == 0){
				throw new RuntimeException("流水号插入失败");
			}
		} else {
			int ures = codeDao.updateFlow(flow);
			
			if(ures == 0){
				//出错
				throw new RuntimeException("流水号更新失败");
			}
		}
		
		flowNo = flow.getNextNo();

		return flowNo;
	}

}
