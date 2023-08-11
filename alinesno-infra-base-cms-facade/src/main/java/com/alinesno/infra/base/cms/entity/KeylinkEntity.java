package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：keylink 表备注：
 *
 * 字段：
 * - keylinkid：关键链接ID
 * - word：关键词
 * - url：链接地址
 *
 * @TableName("keylink")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("keylink")
public class KeylinkEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 关键链接ID
	 */
	@TableField("keylinkid")
	private Integer keylinkid;

	/**
	 * 关键词
	 */
	@TableField("word")
	private String word;

	/**
	 * 链接地址
	 */
	@TableField("url")
	private String url;

	// Getters and Setters

	public Integer getKeylinkid() {
		return keylinkid;
	}

	public void setKeylinkid(Integer keylinkid) {
		this.keylinkid = keylinkid;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
