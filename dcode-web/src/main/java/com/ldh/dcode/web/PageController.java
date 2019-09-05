package com.ldh.dcode.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ldh.dcode.comm.enums.SegmentTypeEnum;
import com.ldh.dcode.entity.Code;
import com.ldh.dcode.entity.CodeDetail;
import com.ldh.dcode.entity.Format;
import com.ldh.dcode.entity.Option;
import com.ldh.dcode.entity.OptionDetail;
import com.ldh.dcode.service.CodeService;
import com.ldh.dcode.service.FormatService;
import com.ldh.dcode.service.OptionService;

@Controller
public class PageController {

	@Resource
	CodeService codeService;
	
	@Resource
	OptionService optionService;
	
	@Resource
	FormatService formatService;
	
	
	@RequestMapping("index")
	public String index(HttpServletRequest request){
		
		List<Code> list = codeService.queryCodes();
		
		request.setAttribute("codeList", list);
		
		return "index";
	}
	
	
	/**
	 * 编码列表
	 * @return
	 */
	@RequestMapping("/code")
	public String code(ModelMap mmap){
		
		List<Code> list = codeService.queryCodes();
		
		mmap.put("codeList", list);
		
		return "code/codeList";
	}
	
	
	/**
	 * 编码详情
	 * @param request
	 * @param pk
	 * @return
	 */
	@RequestMapping("/codeDetail")
	public String codeDetail(ModelMap mmap, String pk){
		
		//编码信息
		Code code = codeService.queryCodeByPk(pk);
		mmap.put("code", code);
		
		//获取编码详情
		List<CodeDetail> list = codeService.queryCodeDetails(pk);
		mmap.put("codeDetailList", list);
		
		//码段类型
		mmap.put("segmentTypeList", SegmentTypeEnum.values());
		
		//获取选项
		List<Option> options = optionService.queryOptions(pk);
		mmap.put("optionList", options);
		
		//时间格式列表
		List<Format> formatList= formatService.queryFormats(pk);
		if(formatList.isEmpty()){
			Format temp = new Format();
			temp.setFormatCode("yyyyMMdd");
			temp.setFormatName("yyyyMMdd");
			formatList.add(temp);
		}
		mmap.put("formatList", formatList);
		
		return "code/codeDetail";
	}
	
	
	
	/**
	 * 属性列表
	 * @param mmap
	 * @return
	 */
	@RequestMapping("/option")
	public String option(ModelMap mmap){
		
		List<Option> list = optionService.queryAllOptions();
		
		mmap.put("optionList", list);
		
		return "option/optionList";
	}
	
	
	
	/**
	 * 属性详情列表
	 * @param mmap
	 * @return
	 */
	@RequestMapping("/optionDetail")
	public String optionDetail(ModelMap mmap, int optionKey){
		
		List<OptionDetail> list = optionService.queryOptionDetails(optionKey);
		
		mmap.put("optionDetailList", list);
		
		return "option/optionDetailList";
	}
	
}
