package com.bootdo.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.card.dao.MusicDao;
import com.bootdo.card.domain.MusicDO;
import com.bootdo.card.service.MusicService;



@Service
public class MusicServiceImpl implements MusicService {
	@Autowired
	private MusicDao musicDao;
	
	@Override
	public MusicDO get(String id){
		return musicDao.get(id);
	}
	
	@Override
	public List<MusicDO> list(Map<String, Object> map){
		return musicDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return musicDao.count(map);
	}
	
	@Override
	public int save(MusicDO music){
		return musicDao.save(music);
	}
	
	@Override
	public int update(MusicDO music){
		return musicDao.update(music);
	}
	
	@Override
	public int remove(String id){
		return musicDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return musicDao.batchRemove(ids);
	}
	
}
