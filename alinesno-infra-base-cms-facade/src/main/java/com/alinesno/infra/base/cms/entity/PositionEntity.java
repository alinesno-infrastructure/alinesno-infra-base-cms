package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：position
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("position")
public class PositionEntity extends InfraBaseEntity {

	// fields

	/**
	 * 位置ID
	 */
	@TableField("posid")
	private Integer posid;

	/**
	 * 模型ID
	 */
	@TableField("modelid")
	private Integer modelid;

	/**
	 * 分类ID
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 最大数量
	 */
	@TableField("maxnum")
	private Integer maxnum;

	/**
	 * 扩展
	 */
	@TableField("extention")
	private String extention;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	private String thumb;

	// getter and setter methods

	public Integer getPosid() {
		return posid;
	}

	public void setPosid(Integer posid) {
		this.posid = posid;
	}

	public Integer getModelid() {
		return modelid;
	}

	public void setModelid(Integer modelid) {
		this.modelid = modelid;
	}

	public Integer getCatid() {
		return catid;
	}

	public void setCatid(Integer catid) {
		this.catid = catid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaxnum() {
		return maxnum;
	}

	public void setMaxnum(Integer maxnum) {
		this.maxnum = maxnum;
	}

	public String getExtention() {
		return extention;
	}

	public void setExtention(String extention) {
		this.extention = extention;
	}

	public Integer getListorder() {
		return listorder;
	}

	public void setListorder(Integer listorder) {
		this.listorder = listorder;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
}
