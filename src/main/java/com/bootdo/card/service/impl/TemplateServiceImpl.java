package com.bootdo.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.card.dao.TemplateDao;
import com.bootdo.card.domain.TemplateDO;
import com.bootdo.card.service.TemplateService;



@Service
public class TemplateServiceImpl implements TemplateService {
	@Autowired
	private TemplateDao templateDao;
	
	@Override
	public TemplateDO get(String id){
		return templateDao.get(id);
	}
	
	@Override
	public List<TemplateDO> list(Map<String, Object> map){
		return templateDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return templateDao.count(map);
	}
	
	@Override
	public int save(TemplateDO template){
		return templateDao.save(template);
	}
	
	@Override
	public int update(TemplateDO template){
		return templateDao.update(template);
	}
	
	@Override
	public int remove(String id){
		return templateDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return templateDao.batchRemove(ids);
	}
	
}
