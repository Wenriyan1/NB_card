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
public class TemplateDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//模板名字
	private String templateName;
	//模板路径
	private String url;
	//内容
	private String contentId;
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
	 * 设置：模板名字
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	/**
	 * 获取：模板名字
	 */
	public String getTemplateName() {
		return templateName;
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
	/**
	 * 设置：内容
	 */
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	/**
	 * 获取：内容
	 */
	public String getContentId() {
		return contentId;
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
