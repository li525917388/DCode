package com.ldh.dcode.entity;

/**
 * 编码详情实体
 * @author Li Dehuan
 * @date 2019年5月6日
 *
 */
public class CodeDetail {

	private String codeKey;		//编码标识
	
	private String segmentType;	//码段类型。FIXED=固定值； OPTION=关联属性；  DATE=时间，FLOW=流水
	
	private int optionKey;		//选项键值
	
	private String segValue;	//码段值
	
	private int length;			//长度
	
	private String format;		//格式
	
	private int orderNo;		//顺序
	
	private int affectFlow;		//是否影响流水

	public String getCodeKey() {
		return codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getSegmentType() {
		return segmentType;
	}

	public void setSegmentType(String segmentType) {
		this.segmentType = segmentType;
	}

	public int getOptionKey() {
		return optionKey;
	}

	public void setOptionKey(int optionKey) {
		this.optionKey = optionKey;
	}

	public String getSegValue() {
		return segValue;
	}

	public void setSegValue(String segValue) {
		this.segValue = segValue;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getAffectFlow() {
		return affectFlow;
	}

	public void setAffectFlow(int affectFlow) {
		this.affectFlow = affectFlow;
	}
	
}
