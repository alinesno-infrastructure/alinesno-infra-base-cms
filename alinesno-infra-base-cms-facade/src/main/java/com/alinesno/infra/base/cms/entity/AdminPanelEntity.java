package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：admin_panel
 * 管理面板实体类
 *
 * <p>管理面板信息</p>
 *
 * @author luoxiaodong
 *@version 1.0.0
 */
@Data
@TableName("admin_panel")
public class AdminPanelEntity extends InfraBaseEntity {

	/**
	 * 菜单ID
	 */
	@TableField("menuid")
	@ColumnType
	@ColumnComment("菜单ID")
	private Integer menuid;

	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length = 255)
	@ColumnComment("名称")
	private String name;

	/**
	 * URL
	 */
	@TableField("url")
	@ColumnType(length = 255)
	@ColumnComment("URL")
	private String url;

	/**
	 * 时间
	 */
	@TableField("datetime")
	@ColumnType
	@ColumnComment("时间")
	private Integer datetime;

}
