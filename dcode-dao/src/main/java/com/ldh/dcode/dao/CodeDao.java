package com.ldh.dcode.dao;

import java.util.List;

import com.ldh.dcode.entity.Code;
import com.ldh.dcode.entity.CodeDetail;
import com.ldh.dcode.entity.Flow;


/**
 * 编码dao
 * @author Li Dehuan
 * @date 2019年5月5日
 *
 */

public interface CodeDao {

	
	/**
	 * 获取编码实体信息
	 * @param pk
	 * @return
	 */
	Code queryCodeByPk(String pk);
	
	
	
	/**
	 * 获取编码详情列表
	 * @param codeKey
	 * @return
	 */
	List<CodeDetail> queryCodeDetails(String codeKey);
	
	
	/**
	 * 获取流水号
	 * @param flow
	 * @return
	 */
	int getFlowNo(Flow flow);
	
	
	/**
	 * 查询流水实体
	 * @param pk
	 * @return
	 */
	Flow queryFlowByPK(String pk);
	
	
	/**
	 * 插入流水实体
	 * @param flow
	 * @return
	 */
	int insertFlow(Flow flow);
	
	
	
	/**
	 * 更新流水
	 * @param flow
	 * @return
	 */
	int updateFlow(Flow flow);
}
