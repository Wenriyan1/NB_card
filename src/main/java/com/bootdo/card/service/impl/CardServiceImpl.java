package com.bootdo.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.card.dao.CardDao;
import com.bootdo.card.domain.CardDO;
import com.bootdo.card.service.CardService;



@Service
public class CardServiceImpl implements CardService {
	@Autowired
	private CardDao cardDao;
	
	@Override
	public CardDO get(String id){
		return cardDao.get(id);
	}
	
	@Override
	public List<CardDO> list(Map<String, Object> map){
		return cardDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return cardDao.count(map);
	}
	
	@Override
	public int save(CardDO card){
		return cardDao.save(card);
	}
	
	@Override
	public int update(CardDO card){
		return cardDao.update(card);
	}
	
	@Override
	public int remove(String id){
		return cardDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return cardDao.batchRemove(ids);
	}
	
}
