package com.ldh.dcode.service;

import java.util.List;

import com.ldh.dcode.entity.Option;
import com.ldh.dcode.entity.OptionDetail;

/**
 * 
 * @author Li Dehuan
 * @date 2019年5月7日
 *
 */
public interface OptionService {

	/**
	 * 获取关联属性列表
	 * @param codeKey
	 * @return
	 */
	List<Option> queryOptions(String codeKey);
	
	
	
	/**
	 * 获取全部关联属性列表
	 * @return
	 */
	List<Option> queryAllOptions();
	
	
	/**
	 * 新增
	 * @return
	 */
	int insertOption(Option option);
	
	
	/**
	 * 修改
	 * @return
	 */
	int updateOption(Option option);
	
	
	
	/**
	 * 删除
	 * @param optionKey
	 * @return
	 */
	int deleteOption(int optionKey);
	
	
	
	/**
	 * 获取属性详情列表
	 * @param optionKey
	 * @return
	 */
	List<OptionDetail> queryOptionDetails(int optionKey);
	
	
	
	/**
	 * 新增详情
	 * @param detail
	 * @return
	 */
	int insertOptionDetail(OptionDetail detail);
	
	
	
	/**
	 * 修改详情
	 * @param detail
	 * @return
	 */
	int updateOptionDetail(OptionDetail detail);
	
	
	/**
	 * 删除详情
	 * @param id
	 * @return
	 */
	int deleteOptionDetail(int id);
}
