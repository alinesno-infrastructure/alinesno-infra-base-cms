package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：news 表备注：
 * 新闻实体类
 *
 * @TableName("news")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("news")
public class NewsEntity extends InfraBaseEntity {

	/**
	 * 栏目ID
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
	 * 推荐位
	 */
	@TableField("posids")
	private Integer posids;

	/**
	 * 链接地址
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
	 * 是否系统添加
	 */
	@TableField("sysadd")
	private Integer sysadd;

	/**
	 * 是否外链
	 */
	@TableField("islink")
	private Integer islink;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 录入时间
	 */
	@TableField("inputtime")
	private Integer inputtime;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	private Integer updatetime;

	// getter and setter
	public Integer getCatid() {
		return this.catid;
	}

	public NewsEntity setCatid(Integer catid) {
		this.catid = catid;
		return this;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public NewsEntity setTypeid(Integer typeid) {
		this.typeid = typeid;
		return this;
	}

	public String getTitle() {
		return this.title;
	}

	public NewsEntity setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getStyle() {
		return this.style;
	}

	public NewsEntity setStyle(String style) {
		this.style = style;
		return this;
	}

	public String getThumb() {
		return this.thumb;
	}

	public NewsEntity setThumb(String thumb) {
		this.thumb = thumb;
		return this;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public NewsEntity setKeywords(String keywords) {
		this.keywords = keywords;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public NewsEntity setDescription(String description) {
		this.description = description;
		return this;
	}

	public Integer getPosids() {
		return this.posids;
	}

	public NewsEntity setPosids(Integer posids) {
		this.posids = posids;
		return this;
	}

	public String getUrl() {
		return this.url;
	}

	public NewsEntity setUrl(String url) {
		this.url = url;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public NewsEntity setListorder(Integer listorder) {
		this.listorder = listorder;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public NewsEntity setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Integer getSysadd() {
		return this.sysadd;
	}

	public NewsEntity setSysadd(Integer sysadd) {
		this.sysadd = sysadd;
		return this;
	}

	public Integer getIslink() {
		return this.islink;
	}

	public NewsEntity setIslink(Integer islink) {
		this.islink = islink;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public NewsEntity setUsername(String username) {
		this.username = username;
		return this;
	}

	public Integer getInputtime() {
		return this.inputtime;
	}

	public NewsEntity setInputtime(Integer inputtime) {
		this.inputtime = inputtime;
		return this;
	}

	public Integer getUpdatetime() {
		return this.updatetime;
	}

	public NewsEntity setUpdatetime(Integer updatetime) {
		this.updatetime = updatetime;
		return this;
	}
}
