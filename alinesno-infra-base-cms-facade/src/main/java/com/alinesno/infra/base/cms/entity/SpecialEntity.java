package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 特殊实体类
 *
 * @TableName("special")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("special")
public class SpecialEntity extends InfraBaseEntity {

	/**
	 * 文章ID
	 */
	@TableField("aid")
	private Integer aid;

	/**
	 * 标题
	 */
	@TableField("title")
	private String title;

	/**
	 * 类型IDs
	 */
	@TableField("typeids")
	private String typeids;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	private String thumb;

	/**
	 * 横幅
	 */
	@TableField("banner")
	private String banner;

	/**
	 * 描述
	 */
	@TableField("description")
	private String description;

	/**
	 * URL
	 */
	@TableField("url")
	private String url;

	/**
	 * 是否HTML
	 */
	@TableField("ishtml")
	private Integer ishtml;

	/**
	 * 是否分页
	 */
	@TableField("ispage")
	private Integer ispage;

	/**
	 * 文件名
	 */
	@TableField("filename")
	private String filename;

	/**
	 * 图片列表
	 */
	@TableField("pics")
	private String pics;

	/**
	 * 投票ID
	 */
	@TableField("voteid")
	private String voteid;

	/**
	 * 样式
	 */
	@TableField("style")
	private String style;

	/**
	 * 首页模板
	 */
	@TableField("index_template")
	private String indexTemplate;

	/**
	 * 列表模板
	 */
	@TableField("list_template")
	private String listTemplate;

	/**
	 * 显示模板
	 */
	@TableField("show_template")
	private String showTemplate;

	/**
	 * CSS
	 */
	@TableField("css")
	private String css;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userid;

	/**
	 * 创建时间
	 */
	@TableField("createtime")
	private Integer createtime;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 精华
	 */
	@TableField("elite")
	private Integer elite;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	private Integer disabled;

	/**
	 * 是否视频
	 */
	@TableField("isvideo")
	private Integer isvideo;

	// getter and setter
	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTypeids() {
		return typeids;
	}

	public void setTypeids(String typeids) {
		this.typeids = typeids;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getIshtml() {
		return ishtml;
	}

	public void setIshtml(Integer ishtml) {
		this.ishtml = ishtml;
	}

	public Integer getIspage() {
		return ispage;
	}

	public void setIspage(Integer ispage) {
		this.ispage = ispage;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
	}

	public String getVoteid() {
		return voteid;
	}

	public void setVoteid(String voteid) {
		this.voteid = voteid;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getIndexTemplate() {
		return indexTemplate;
	}

	public void setIndexTemplate(String indexTemplate) {
		this.indexTemplate = indexTemplate;
	}

	public String getListTemplate() {
		return listTemplate;
	}

	public void setListTemplate(String listTemplate) {
		this.listTemplate = listTemplate;
	}

	public String getShowTemplate() {
		return showTemplate;
	}

	public void setShowTemplate(String showTemplate) {
		this.showTemplate = showTemplate;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public Integer getListorder() {
		return listorder;
	}

	public void setListorder(Integer listorder) {
		this.listorder = listorder;
	}

	public Integer getElite() {
		return elite;
	}

	public void setElite(Integer elite) {
		this.elite = elite;
	}

	public Integer getDisabled() {
		return disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}

	public Integer getIsvideo() {
		return isvideo;
	}

	public void setIsvideo(Integer isvideo) {
		this.isvideo = isvideo;
	}
}

