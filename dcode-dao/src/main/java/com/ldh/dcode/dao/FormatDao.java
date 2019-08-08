package com.ldh.dcode.dao;

import java.util.List;

import com.ldh.dcode.entity.Format;

/**
 * 时间格式dao
 * @author Li Dehuan
 * @date 2019年5月16日
 *
 */
public interface FormatDao {

	/**
	 * 获取编码的时间格式列表
	 * @param codeKey
	 * @return
	 */
	List<Format> queryFormats(String codeKey);
	
}
