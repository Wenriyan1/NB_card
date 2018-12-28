package com.bootdo.card.domain;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;



/**
 * 
 * 
 * @author wenriyan
 * @email 1992lcg@163.com
 * @date 2018-12-27 10:25:17
 */
public class CardDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//贺卡名字
	private String cardName;
	//贺卡标题
	private String title;
	//贺卡类型（目前有：历史贺卡，非历史贺卡）
	private String cardType;
	//内容
	private String content;
	//模板id
	private String templateId;
	//模板名字
	private String templateName;
	//模板路径
	private String templateUrl;
	//音乐id
	private String musicId;
	//音乐路径
	private String musicName;
	//音乐名字
	private String musicUrl;
	//创建人
	private String creatUser;
	//创建时间
	private Date createTime;
	//状态
	private String status;
	//头像大小
	private String portraitSize;
	//头像名称
	private String portaitUrl;

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
	 * 设置：贺卡名字
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	/**
	 * 获取：贺卡名字
	 */
	public String getCardName() {
		return cardName;
	}
	/**
	 * 设置：贺卡标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：贺卡标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 获取：贺卡类型
	 * @return
	 */
	public String getCardType() {
		return cardType;
	}
	/**
	 * 设置：贺卡类型
	 * @param cardType
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	/**
	 * 设置：模板id
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	/**
	 * 获取：模板id
	 */
	public String getTemplateId() {
		return templateId;
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
	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}
	/**
	 * 获取：模板路径
	 */
	public String getTemplateUrl() {
		return templateUrl;
	}
	/**
	 * 设置：音乐id
	 */
	public void setMusicId(String musicId) {
		this.musicId = musicId;
	}
	/**
	 * 获取：音乐id
	 */
	public String getMusicId() {
		return musicId;
	}
	/**
	 * 设置：音乐路径
	 */
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	/**
	 * 获取：音乐路径
	 */
	public String getMusicName() {
		return musicName;
	}
	/**
	 * 设置：音乐名字
	 */
	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}
	/**
	 * 获取：音乐名字
	 */
	public String getMusicUrl() {
		return musicUrl;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreatUser(String creatUser) {
		this.creatUser = creatUser;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreatUser() {
		return creatUser;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：头像大小
	 */
	public void setPortraitSize(String portraitSize) {
		this.portraitSize = portraitSize;
	}
	/**
	 * 获取：头像大小
	 */
	public String getPortraitSize() {
		return portraitSize;
	}
	/**
	 * 设置：头像名称
	 */
	public void setPortaitUrl(String portaitUrl) {
		this.portaitUrl = portaitUrl;
	}
	/**
	 * 获取：头像名称
	 */
	public String getPortaitUrl() {
		return portaitUrl;
	}
}
