package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：keyword 表备注：
 *
 * 字段：
 * - siteid：站点ID
 * - keyword：关键词
 * - pinyin：拼音
 * - videonum：视频数量
 * - searchnums：搜索次数
 *
 * @TableName("keyword")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("keyword")
public class KeywordEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 关键词
	 */
	@TableField("keyword")
	private String keyword;

	/**
	 * 拼音
	 */
	@TableField("pinyin")
	private String pinyin;

	/**
	 * 视频数量
	 */
	@TableField("videonum")
	private Long videonum;

	/**
	 * 搜索次数
	 */
	@TableField("searchnums")
	private Integer searchnums;

	// Getters and Setters

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public Long getVideonum() {
		return videonum;
	}

	public void setVideonum(Long videonum) {
		this.videonum = videonum;
	}

	public Integer getSearchnums() {
		return searchnums;
	}

	public void setSearchnums(Integer searchnums) {
		this.searchnums = searchnums;
	}
}
