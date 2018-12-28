package com.bootdo.card.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author wenriyan
 * @email 1992lcg@163.com
 * @date 2018-12-27 10:25:18
 */
public class ContentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//内容id
	private String content;

	/**
	 * 设置：id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：内容id
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：内容id
	 */
	public String getContent() {
		return content;
	}
}
