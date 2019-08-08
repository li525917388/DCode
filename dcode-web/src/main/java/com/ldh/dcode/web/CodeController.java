package com.ldh.dcode.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ldh.dcode.entity.CodeDetail;
import com.ldh.dcode.service.CodeService;


@Controller
@RequestMapping("/code")
public class CodeController {

	@Resource
	CodeService codeService;
	
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	}
	
	
	/**
	 * 获取编码
	 * @param pk
	 * @return
	 */
	@RequestMapping("/getCode")
	@ResponseBody
	public String getCode(String pk){
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("dept", "cgb");
		
		return codeService.getCode(pk, params );
	}
	
	
	
	/**
	 * 更新编码详情
	 * @param request
	 * @param codeKey
	 */
	@RequestMapping("updateCodeDetail")
	@ResponseBody
	public int updateCodeDetail(HttpServletRequest request, String codeKey){
		
		String[] segmentTypes = request.getParameterValues("segmentType");	//码段类型
		String[] optionKeys = request.getParameterValues("optionKey");		//关联属性名称
		String[] segValues = request.getParameterValues("segValue");		//码段值
		String[] lengths = request.getParameterValues("length");
		String[] formats = request.getParameterValues("format");
		String[] orderNos = request.getParameterValues("orderNo");
		String[] affectFlows = request.getParameterValues("affectFlow");
		
		List<CodeDetail> list = new ArrayList<CodeDetail>();
		
		for(int i = 0; i < segmentTypes.length; i++){
			CodeDetail cd = new CodeDetail();
			cd.setCodeKey(codeKey);
			cd.setSegmentType(segmentTypes[i]);
			cd.setOptionKey(Integer.parseInt(optionKeys[i]));
			cd.setSegValue(segValues[i]);
			cd.setLength(Integer.parseInt(lengths[i]));
			cd.setFormat(formats[i]);
			cd.setOrderNo(Integer.parseInt(orderNos[i]));
			cd.setAffectFlow(Integer.parseInt(affectFlows[i]));
			
			list.add(cd);
		}
		
		int res = codeService.updateCodeDetail(codeKey,list);
		
		System.out.println(res);
		
		return res;
	}
	
	
	
	
	@RequestMapping("removeCode")
	public String removeCode(String pk){
		
		int res = codeService.removeCode(pk);
		
		return res + "";
	}
}
