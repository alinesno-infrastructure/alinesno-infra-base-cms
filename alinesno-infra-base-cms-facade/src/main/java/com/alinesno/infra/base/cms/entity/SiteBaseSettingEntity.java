package com.alinesno.infra.base.cms.entity;

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
public class SiteBaseSettingEntity extends InfraBaseEntity  {

	// fields

	/**
	 * name
	 */
	@TableField("name")
	private String name;

	/**
	 * 站点背景图
	 */
	@TableField("background_image")
	private String backgroundImage;

	/**
	 * SEO配置
	 */
	@TableField("seo_setting")
	private String seoSetting;

	/**
	 * 关键字
	 */
	@TableField("keywords")
	private String keywords;

	/**
	 * 主题
	 */
	@TableField("theme")
	private Integer theme;

	// getter and setter methods

	/**
	 * 获取name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name
	 *
	 * @param name name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取backgroundImage
	 *
	 * @return backgroundImage
	 */
	public String getBackgroundImage() {
		return backgroundImage;
	}

	/**
	 * 设置backgroundImage
	 *
	 * @param backgroundImage backgroundImage
	 */
	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	/**
	 * 获取seoSetting
	 *
	 * @return seoSetting
	 */
	public String getSeoSetting() {
		return seoSetting;
	}

	/**
	 * 设置seoSetting
	 *
	 * @param seoSetting seoSetting
	 */
	public void setSeoSetting(String seoSetting) {
		this.seoSetting = seoSetting;
	}

	/**
	 * 获取keywords
	 *
	 * @return keywords
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * 设置keywords
	 *
	 * @param keywords keywords
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * 获取theme
	 *
	 * @return theme
	 */
	public Integer getTheme() {
		return theme;
	}

	/**
	 * 设置theme
	 *
	 * @param theme theme
	 */
	public void setTheme(Integer theme) {
		this.theme = theme;
	}

}
