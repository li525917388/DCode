package com.ldh.dcode.service;

import java.util.List;

import com.ldh.dcode.entity.Option;

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
}
