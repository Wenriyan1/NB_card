package com.bootdo.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.card.dao.HContentDao;
import com.bootdo.card.domain.HContentDO;
import com.bootdo.card.service.HContentService;



@Service
public class HContentServiceImpl implements HContentService {
	@Autowired
	private HContentDao hContentDao;
	
	@Override
	public HContentDO get(String id){
		return hContentDao.get(id);
	}
	
	@Override
	public List<HContentDO> list(Map<String, Object> map){
		return hContentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return hContentDao.count(map);
	}
	
	@Override
	public int save(HContentDO hContent){
		return hContentDao.save(hContent);
	}
	
	@Override
	public int update(HContentDO hContent){
		return hContentDao.update(hContent);
	}
	
	@Override
	public int remove(String id){
		return hContentDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return hContentDao.batchRemove(ids);
	}
	
}
