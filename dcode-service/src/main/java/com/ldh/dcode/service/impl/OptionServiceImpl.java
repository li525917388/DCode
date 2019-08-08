package com.ldh.dcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.dcode.dao.OptionDao;
import com.ldh.dcode.entity.Option;
import com.ldh.dcode.service.OptionService;

/**
 * 
 * @author Li Dehuan
 * @date 2019年5月7日
 *
 */
@Service("OptionService")
public class OptionServiceImpl implements OptionService {

	@Resource
	OptionDao optionDao;
	
	@Override
	public List<Option> queryOptions(String codeKey) {
		// TODO Auto-generated method stub
		return optionDao.queryOptions(codeKey);
	}

}
