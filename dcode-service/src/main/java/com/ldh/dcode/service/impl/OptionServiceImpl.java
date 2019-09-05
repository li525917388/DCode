package com.ldh.dcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.dcode.dao.OptionDao;
import com.ldh.dcode.entity.Option;
import com.ldh.dcode.entity.OptionDetail;
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

	
	@Override
	public List<Option> queryAllOptions() {
		// TODO Auto-generated method stub
		return optionDao.queryAllOptions();
	}


	@Override
	public int insertOption(Option option) {
		// TODO Auto-generated method stub
		return optionDao.insertOption(option);
	}


	@Override
	public int updateOption(Option option) {
		// TODO Auto-generated method stub
		return optionDao.updateOption(option);
	}


	@Override
	public int deleteOption(int optionKey) {
		// TODO Auto-generated method stub
		return optionDao.deleteOption(optionKey);
	}


	@Override
	public List<OptionDetail> queryOptionDetails(int optionKey) {
		// TODO Auto-generated method stub
		return optionDao.queryOptionDetails(optionKey);
	}


	@Override
	public int insertOptionDetail(OptionDetail detail) {
		// TODO Auto-generated method stub
		return optionDao.insertOptionDetail(detail);
	}


	@Override
	public int updateOptionDetail(OptionDetail detail) {
		// TODO Auto-generated method stub
		return optionDao.updateOptionDetail(detail);
	}


	@Override
	public int deleteOptionDetail(int id) {
		// TODO Auto-generated method stub
		return optionDao.deleteOptionDetail(id);
	}

}
