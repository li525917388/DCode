package com.ldh.dcode.service;

import java.util.Map;


/**
 * 编码service
 * @author Li Dehuan
 * @date 2019年5月5日
 *
 */
public interface CodeService {

	
	/**
	 * 获取流水号
	 * @param codeKey 编码标识
	 * @param params 关联属性参数键值对
	 * @return
	 */
	String getCode(String codeKey, Map<String, Object> params);
	
	
	
	/**
	 * 获取流水号
	 * @param flowKey
	 * @return
	 */
	Integer getFlowNo(String flowKey);
}
