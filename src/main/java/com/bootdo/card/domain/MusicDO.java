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
public class MusicDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//音乐名称
	private String musicName;
	//模板路径
	private String url;

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
	 * 设置：音乐名称
	 */
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	/**
	 * 获取：音乐名称
	 */
	public String getMusicName() {
		return musicName;
	}
	/**
	 * 设置：模板路径
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：模板路径
	 */
	public String getUrl() {
		return url;
	}
}
