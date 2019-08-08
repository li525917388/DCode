package com.ldh.dcode.dao;

import java.util.List;

import com.ldh.dcode.entity.Option;
import com.ldh.dcode.entity.OptionDetail;

/**
 * 选择项dao
 * @author Li Dehuan
 * @date 2019年5月6日
 *
 */
public interface OptionDao {
	
	

	/**
	 * 查询选择项详情列表
	 * @param params
	 * @return
	 */
	List<OptionDetail> queryOptionDetail(int optionKey);
	
	
	/**
	 * 获取关联属性列表
	 * @param codeKey
	 * @return
	 */
	List<Option> queryOptions(String codeKey);
}
