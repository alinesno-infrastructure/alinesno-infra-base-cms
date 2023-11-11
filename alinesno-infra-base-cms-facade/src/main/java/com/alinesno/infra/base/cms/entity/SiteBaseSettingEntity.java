package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 站点基本设置
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("site_base_setting")
@Data
public class SiteBaseSettingEntity extends InfraBaseEntity  {

	// fields

	/**
	 * name
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("name")
	private String name;

	/**
	 * 站点背景图
	 */
	@TableField("background_image")
	@ColumnType(length=255)
	@ColumnComment("站点背景图")
	private String backgroundImage;

	/**
	 * SEO配置
	 */
	@TableField("seo_setting")
	@ColumnType(length=255)
	@ColumnComment("SEO配置")
	private String seoSetting;

	/**
	 * 关键字
	 */
	@TableField("keywords")
	@ColumnType(length=255)
	@ColumnComment("关键字")
	private String keywords;

	/**
	 * 主题
	 */
	@TableField("theme")
	@ColumnType(length=255)
	@ColumnComment("主题")
	private Integer theme;
}
