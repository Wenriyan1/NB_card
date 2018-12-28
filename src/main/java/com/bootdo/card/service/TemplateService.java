package com.bootdo.card.service;

import com.bootdo.card.domain.TemplateDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author wenriyan
 * @email 1992lcg@163.com
 * @date 2018-12-27 10:25:18
 */
public interface TemplateService {
	
	TemplateDO get(String id);
	
	List<TemplateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TemplateDO template);
	
	int update(TemplateDO template);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
