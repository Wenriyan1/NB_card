package com.bootdo.card.service;

import com.bootdo.card.domain.HContentDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-27 14:21:37
 */
public interface HContentService {
	
	HContentDO get(String id);
	
	List<HContentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HContentDO hContent);
	
	int update(HContentDO hContent);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
