package com.ldh.dcode.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ldh.dcode.service.CodeService;


@Controller
@RequestMapping("/code")
public class CodeController {

	@Resource
	CodeService codeService;
	
	@RequestMapping("index")
	public String index(){
		
		return "index";
	}
	
	
	/**
	 * 获取编码
	 * @param pk
	 * @return
	 */
	@RequestMapping("getCode")
	@ResponseBody
	public String getCode(String pk){
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("dept", "cgb");
		
		return codeService.getCode(pk, params );
	}
	
}
