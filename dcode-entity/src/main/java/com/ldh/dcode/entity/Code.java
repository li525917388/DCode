package com.ldh.dcode.entity;

import java.util.Date;

/**
 * 编码实体
 * @author Li Dehuan
 * @date 2019年5月5日
 *
 */
public class Code {

	private String codeKey;		//编码标识
	
	private String codeName;	//编码名称
	
	private int invalid;		//是否有效
	
	private Date createTime;	//创建时间
	
	private int version;		//版本号

	public String getCodeKey() {
		return codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public int getInvalid() {
		return invalid;
	}

	public void setInvalid(int invalid) {
		this.invalid = invalid;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
