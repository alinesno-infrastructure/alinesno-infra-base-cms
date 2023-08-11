package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：search_keyword 表备注：
 *
 * 数据表 search_keyword 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("search_keyword")
public class SearchKeywordEntity extends InfraBaseEntity {

	// fields

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
	 * 搜索次数
	 */
	@TableField("searchnums")
	private Integer searchnums;

	/**
	 * 数据
	 */
	@TableField("data")
	private String data;

	// getter and setter methods

	/**
	 * 获取关键词
	 *
	 * @return 关键词
	 */
	public String getKeyword() {
		return this.keyword;
	}

	/**
	 * 设置关键词
	 *
	 * @param keyword 关键词
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * 获取拼音
	 *
	 * @return 拼音
	 */
	public String getPinyin() {
		return this.pinyin;
	}

	/**
	 * 设置拼音
	 *
	 * @param pinyin 拼音
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	/**
	 * 获取搜索次数
	 *
	 * @return 搜索次数
	 */
	public Integer getSearchnums() {
		return this.searchnums;
	}

	/**
	 * 设置搜索次数
	 *
	 * @param searchnums 搜索次数
	 */
	public void setSearchnums(Integer searchnums) {
		this.searchnums = searchnums;
	}

	/**
	 * 获取数据
	 *
	 * @return 数据
	 */
	public String getData() {
		return this.data;
	}

	/**
	 * 设置数据
	 *
	 * @param data 数据
	 */
	public void setData(String data) {
		this.data = data;
	}
}
