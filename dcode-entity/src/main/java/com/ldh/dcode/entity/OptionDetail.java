package com.ldh.dcode.entity;

/**
 * 关联属性选项
 * @author Li Dehuan
 * @date 2019年5月6日
 *
 */
public class OptionDetail {

	private int id;				//主键
	
	private int optionKey;		//
	
	private String property;	//属性名称
	
	private String propertyVal;	//属性值
	
	private String codeVal;		//属性对应编码值
	
	private String remark;		// 备注

	public int getOptionKey() {
		return optionKey;
	}

	public void setOptionKey(int optionKey) {
		this.optionKey = optionKey;
	}

	public String getPropertyVal() {
		return propertyVal;
	}

	public void setPropertyVal(String propertyVal) {
		this.propertyVal = propertyVal;
	}

	public String getCodeVal() {
		return codeVal;
	}

	public void setCodeVal(String codeVal) {
		this.codeVal = codeVal;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
