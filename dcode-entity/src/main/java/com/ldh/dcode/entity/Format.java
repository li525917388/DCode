package com.ldh.dcode.entity;

/**
 * 格式列表
 * @author Li Dehuan
 * @date 2019年5月16日
 *
 */
public class Format {

	private String codeKey;			//编码标识
	
	private String formatCode;		//编码
	
	private String formatName;		//名称

	public String getCodeKey() {
		return codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getFormatCode() {
		return formatCode;
	}

	public void setFormatCode(String formatCode) {
		this.formatCode = formatCode;
	}

	public String getFormatName() {
		return formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}
	
}
