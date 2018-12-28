package com.bootdo.card.service;

import com.bootdo.card.domain.CardDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author wenriyan
 * @email 1992lcg@163.com
 * @date 2018-12-27 10:25:17
 */
public interface CardService {
	
	CardDO get(String id);
	
	List<CardDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CardDO card);
	
	int update(CardDO card);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
