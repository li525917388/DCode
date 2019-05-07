package com.ldh.dcode.comm.enums;


/**
 * 码段类型
 * @author Li Dehuan
 * @date 2019年5月6日
 *
 */
public enum SegmentTypeEnum {

	/**
	 * 固定值
	 */
	FIXED("FIXED","固定值"),
	
	/**
	 * 关联选项
	 */
	OPTION("OPTION","关联选项"),
	
	/**
	 * 时间
	 */
	DATE("DATE","时间"),
	
	/**
	 * 流水
	 */
	FLOW("FLOW","流水");
	
	private String code;
	private String name;
	
	private SegmentTypeEnum(String code, String name){
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
