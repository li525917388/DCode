package com.ldh.dcode.service;

import java.util.List;
import java.util.Map;

import com.ldh.dcode.entity.Code;
import com.ldh.dcode.entity.CodeDetail;


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
	
	
	/**
	 * 
	 * @return
	 */
	List<Code> queryCodes();
	
	
	
	/**
	 * 获取编码详情列表
	 * @param codeKey
	 * @return
	 */
	List<CodeDetail> queryCodeDetails(String codeKey);



	
	/**
	 * 更新编码详情
	 * @param codeKey
	 * @param list
	 * @return
	 */
	int updateCodeDetail(String codeKey, List<CodeDetail> list);



	
	/**
	 * 获取编码实体
	 * @param codeKey
	 * @return
	 */
	Code queryCodeByPk(String codeKey);



	
	/**
	 * 删除编码
	 * @param pk
	 * @return
	 */
	int removeCode(String pk);
}
