package com.ldh.dcode.entity;

/**
 * 流水实体
 * @author Li Dehuan
 * @date 2019年5月6日
 *
 */
public class Flow {

	private String codeKey;		//编码标识
	
	private String flowKey;		//流水标识
	
	private int nowNo;				//当前流水
	
	private int nextNo;				//下一个流水

	public String getCodeKey() {
		return codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getFlowKey() {
		return flowKey;
	}

	public void setFlowKey(String flowKey) {
		this.flowKey = flowKey;
	}

	public int getNowNo() {
		return nowNo;
	}

	public void setNowNo(int nowNo) {
		this.nowNo = nowNo;
	}

	public int getNextNo() {
		return nextNo;
	}

	public void setNextNo(int nextNo) {
		this.nextNo = nextNo;
	}

}
