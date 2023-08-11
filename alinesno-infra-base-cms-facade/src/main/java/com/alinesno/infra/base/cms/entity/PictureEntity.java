package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：picture
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("picture")
public class PictureEntity extends InfraBaseEntity {

	// fields

	/**
	 * 分类ID
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	private Integer typeid;

	/**
	 * 标题
	 */
	@TableField("title")
	private String title;

	/**
	 * 样式
	 */
	@TableField("style")
	private String style;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	private String thumb;

	/**
	 * 关键词
	 */
	@TableField("keywords")
	private String keywords;

	/**
	 * 描述
	 */
	@TableField("description")
	private String description;

	/**
	 * 位置ID
	 */
	@TableField("posids")
	private Integer posids;

	/**
	 * URL
	 */
	@TableField("url")
	private String url;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 状态
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 系统添加
	 */
	@TableField("sysadd")
	private Integer sysadd;

	/**
	 * 是否链接
	 */
	@TableField("islink")
	private Integer islink;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 输入时间
	 */
	@TableField("inputtime")
	private Integer inputtime;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	private Integer updatetime;

	// getter and setter methods

	public Integer getCatid() {
		return catid;
	}

	public void setCatid(Integer catid) {
		this.catid = catid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPosids() {
		return posids;
	}

	public void setPosids(Integer posids) {
		this.posids = posids;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getListorder() {
		return listorder;
	}

	public void setListorder(Integer listorder) {
		this.listorder = listorder;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSysadd() {
		return sysadd;
	}

	public void setSysadd(Integer sysadd) {
		this.sysadd = sysadd;
	}

	public Integer getIslink() {
		return islink;
	}

	public void setIslink(Integer islink) {
		this.islink = islink;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getInputtime() {
		return inputtime;
	}

	public void setInputtime(Integer inputtime) {
		this.inputtime = inputtime;
	}

	public Integer getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Integer updatetime) {
		this.updatetime = updatetime;
	}
}
