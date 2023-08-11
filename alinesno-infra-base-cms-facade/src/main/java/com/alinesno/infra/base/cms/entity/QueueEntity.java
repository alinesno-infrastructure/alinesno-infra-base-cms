package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：queue 表备注：
 *
 * 数据表 queue 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("queue")
public class QueueEntity extends InfraBaseEntity {

	// fields

	/**
	 * 类型
	 */
	@TableField("type")
	private String type;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 路径
	 */
	@TableField("path")
	private String path;

	/**
	 * 状态1
	 */
	@TableField("status1")
	private Integer status1;

	/**
	 * 状态2
	 */
	@TableField("status2")
	private Integer status2;

	/**
	 * 状态3
	 */
	@TableField("status3")
	private Integer status3;

	/**
	 * 状态4
	 */
	@TableField("status4")
	private Integer status4;

	/**
	 * 次数
	 */
	@TableField("times")
	private Integer times;

	// getter and setter methods

	/**
	 * 获取类型
	 *
	 * @return 类型
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * 设置类型
	 *
	 * @param type 类型
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取站点ID
	 *
	 * @return 站点ID
	 */
	public Integer getSiteid() {
		return this.siteid;
	}

	/**
	 * 设置站点ID
	 *
	 * @param siteid 站点ID
	 */
	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	/**
	 * 获取路径
	 *
	 * @return 路径
	 */
	public String getPath() {
		return this.path;
	}

	/**
	 * 设置路径
	 *
	 * @param path 路径
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 获取状态1
	 *
	 * @return 状态1
	 */
	public Integer getStatus1() {
		return this.status1;
	}

	/**
	 * 设置状态1
	 *
	 * @param status1 状态1
	 */
	public void setStatus1(Integer status1) {
		this.status1 = status1;
	}

	/**
	 * 获取状态2
	 *
	 * @return 状态2
	 */
	public Integer getStatus2() {
		return this.status2;
	}

	/**
	 * 设置状态2
	 *
	 * @param status2 状态2
	 */
	public void setStatus2(Integer status2) {
		this.status2 = status2;
	}

	/**
	 * 获取状态3
	 *
	 * @return 状态3
	 */
	public Integer getStatus3() {
		return this.status3;
	}

	/**
	 * 设置状态3
	 *
	 * @param status3 状态3
	 */
	public void setStatus3(Integer status3) {
		this.status3 = status3;
	}

	/**
	 * 获取状态4
	 *
	 * @return 状态4
	 */
	public Integer getStatus4() {
		return this.status4;
	}

	/**
	 * 设置状态4
	 *
	 * @param status4 状态4
	 */
	public void setStatus4(Integer status4) {
		this.status4 = status4;
	}

	/**
	 * 获取次数
	 *
	 * @return 次数
	 */
	public Integer getTimes() {
		return this.times;
	}

	/**
	 * 设置次数
	 *
	 * @param times 次数
	 */
	public void setTimes(Integer times) {
		this.times = times;
	}
}
