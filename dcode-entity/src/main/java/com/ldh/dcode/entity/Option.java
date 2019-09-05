package com.ldh.dcode.entity;

/**
 * 关联属性选择
 * @author Li Dehuan
 * @date 2019年5月6日
 *
 */
public class Option {

	private int optionKey;		//
	
	private String codeKey;		//编码标识
	
	private String codeName;	//编码名称
	
	private String property;	//属性名称

	public int getOptionKey() {
		return optionKey;
	}

	public void setOptionKey(int optionKey) {
		this.optionKey = optionKey;
	}

	public String getCodeKey() {
		return codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	
}
