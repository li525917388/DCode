package com.ldh.dcode.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ldh.dcode.entity.Option;
import com.ldh.dcode.entity.OptionDetail;
import com.ldh.dcode.service.OptionService;

@Controller
@RequestMapping("/option")
public class OptionController {

	@Resource
	OptionService optionService;
	
	
	
	/**
	 * 新增
	 * @param option
	 * @return
	 */
	@PostMapping("addOption")
	@ResponseBody
	public int addOption(Option option){
		
		int res = optionService.insertOption(option);
		
		return res;
	}
	
	
	/**
	 * 修改
	 * @param option
	 * @return
	 */
	@PostMapping("updateOption")
	@ResponseBody
	public int updateOption(Option option){
		
		int res = optionService.updateOption(option);
		
		return res;
	}
	
	
	
	
	/**
	 * 删除
	 * @param optionKey
	 * @return
	 */
	@PostMapping("removeOption")
	@ResponseBody
	public int removeOption(int optionKey){
		
		int res = optionService.deleteOption(optionKey);
		
		return res;
	}
	
	
	
	
	/**
	 * 新增详情
	 * @param optionDetail
	 * @return
	 */
	@PostMapping("addOptionDetail")
	@ResponseBody
	public int addOptionDetail(OptionDetail optionDetail){
		
		int res = optionService.insertOptionDetail(optionDetail);
		
		return res;
	}
	
	
	/**
	 * 修改详情
	 * @param option
	 * @return
	 */
	@PostMapping("updateOptionDetail")
	@ResponseBody
	public int updateOptionDetail(OptionDetail optionDetail){
		
		int res = optionService.updateOptionDetail(optionDetail);
		
		return res;
	}
	
	
	
	
	/**
	 * 删除详情
	 * @param optionKey
	 * @return
	 */
	@PostMapping("removeOptionDetail")
	@ResponseBody
	public int removeOptionDetail(int id){
		
		int res = optionService.deleteOptionDetail(id);
		
		return res;
	}
	
}
