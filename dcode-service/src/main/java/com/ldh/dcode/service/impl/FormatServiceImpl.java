package com.ldh.dcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.dcode.dao.FormatDao;
import com.ldh.dcode.entity.Format;
import com.ldh.dcode.service.FormatService;

@Service("FormatService")
public class FormatServiceImpl implements FormatService {

	@Resource
	FormatDao formatDao;
	
	/*
	 * 获取编码的时间格式列表
	 * @see com.ldh.dcode.service.FormatService#queryFormats(java.lang.String)
	 * 2019年5月16日
	 */
	@Override
	public List<Format> queryFormats(String codeKey) {

		return formatDao.queryFormats(codeKey);
	}

}
