package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.EqualsAndHashCode;

/**
 * 数据表： collection_node 表备注：
 * 收集节点实体类
 *
 * Fields:
 * - nodeid: 节点ID
 * - name: 名称
 * - lastdate: 最后日期
 * - siteid: 站点ID
 * - sourcecharset: 源字符集
 * - sourcetype: 源类型
 * - urlpage: URL页面
 * - pagesizeStart: 页面大小开始
 * - pagesizeEnd: 页面大小结束
 * - pageBase: 页面基础
 * - parNum: 参数数量
 * - urlContain: URL包含
 * - urlExcept: URL排除
 * - urlStart: URL开始
 * - urlEnd: URL结束
 * - titleRule: 标题规则
 * - titleHtmlRule: 标题HTML规则
 * - authorRule: 作者规则
 * - authorHtmlRule: 作者HTML规则
 * - comeformRule: 来源规则
 * - comeformHtmlRule: 来源HTML规则
 * - timeRule: 时间规则
 * - timeHtmlRule: 时间HTML规则
 * - contentRule: 内容规则
 * - contentHtmlRule: 内容HTML规则
 * - contentPageStart: 内容页开始
 * - contentPageEnd: 内容页结束
 * - contentPageRule: 内容页规则
 * - contentPage: 内容页
 * - contentNextpage: 下一页内容
 * - downAttachment: 下载附件
 * - watermark: 水印
 * - collOrder: 收集顺序
 * - customizeConfig: 自定义配置
 *
 * @TableName("collection_node")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("collection_node")
@Data
public class CollectionNodeEntity extends InfraBaseEntity {

	// Fields

	/**
	 * 节点ID
	 */
	@Excel(name = "节点ID")
	@TableField("nodeid")
	@ColumnType(length=255)
	@ColumnComment("nodeid")
	private Integer nodeid;

	/**
	 * 名称
	 */
	@Excel(name = "名称")
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 最后日期
	 */
	@Excel(name = "最后日期")
	@TableField("lastdate")
	@ColumnType(length=255)
	@ColumnComment("最后日期")
	private Integer lastdate;

	/**
	 * 站点ID
	 */
	@Excel(name = "站点ID")
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 源字符集
	 */
	@Excel(name = "源字符集")
	@TableField("sourcecharset")
	@ColumnType(length=255)
	@ColumnComment("源字符集")
	private String sourcecharset;

	/**
	 * 源类型
	 */
	@Excel(name = "源类型")
	@TableField("sourcetype")
	@ColumnType(length=255)
	@ColumnComment("源类型")
	private Integer sourcetype;

	/**
	 * URL页面
	 */
	@Excel(name = "URL页面")
	@TableField("urlpage")
	@ColumnType(length=255)
	@ColumnComment("url页面")
	private String urlpage;

	/**
	 * 页面大小开始
	 */
	@Excel(name = "页面大小开始")
	@TableField("pagesize_start")
	@ColumnType(length=255)
	@ColumnComment("pagesize开始")
	private Integer pagesizeStart;

	/**
	 * 页面大小结束
	 */
	@Excel(name = "页面大小结束")
	@TableField("pagesize_end")
	@ColumnType(length=255)
	@ColumnComment("页面大小结束")
	private Integer pagesizeEnd;

	/**
	 * 页面基础
	 */
	@Excel(name = "页面基础")
	@TableField("page_base")
	@ColumnType(length=255)
	@ColumnComment("pageBase")
	private String pageBase;

	/**
	 * 参数数量
	 */
	@Excel(name = "参数数量")
	@TableField("par_num")
	@ColumnType(length=255)
	@ColumnComment("parNum")
	private Integer parNum;

	/**
	 * URL包含
	 */
	@Excel(name = "URL包含")
	@TableField("url_contain")
	@ColumnType(length=255)
	@ColumnComment("url包含")
	private String urlContain;

	/**
	 * URL排除
	 */
	@Excel(name = "URL排除")
	@TableField("url_except")
	@ColumnType(length=255)
	@ColumnComment("url除外")
	private String urlExcept;

	/**
	 * URL开始
	 */
	@Excel(name = "URL开始")
	@TableField("url_start")
	@ColumnType(length=255)
	@ColumnComment("urlStart")
	private String urlStart;

	/**
	 * URL结束
	 */
	@Excel(name = "URL结束")
	@TableField("url_end")
	@ColumnType(length=255)
	@ColumnComment("urlEnd")
	private String urlEnd;

	/**
	 * 标题规则
	 */
	@Excel(name = "标题规则")
	@TableField("title_rule")
	@ColumnType(length=255)
	@ColumnComment("title规则")
	private String titleRule;

	/**
	 * 标题HTML规则
	 */
	@Excel(name = "标题HTML规则")
	@TableField("title_html_rule")
	@ColumnType(length=255)
	@ColumnComment("title Html规则")
	private String titleHtmlRule;

	/**
	 * 作者规则
	 */
	@Excel(name = "作者规则")
	@TableField("author_rule")
	@ColumnType(length=255)
	@ColumnComment("authorRule")
	private String authorRule;

	/**
	 * 作者HTML规则
	 */
	@Excel(name = "作者HTML规则")
	@TableField("author_html_rule")
	@ColumnType(length=255)
	@ColumnComment("authorHtml规则")
	private String authorHtmlRule;

	/**
	 * 来源规则
	 */
	@Excel(name = "来源规则")
	@TableField("comeform_rule")
	@ColumnType(length=255)
	@ColumnComment("comeformRule")
	private String comeformRule;

	/**
	 * 来源HTML规则
	 */
	@Excel(name = "来源HTML规则")
	@TableField("comeform_html_rule")
	@ColumnType(length=255)
	@ColumnComment("comeformHtml规则")
	private String comeformHtmlRule;

	/**
	 * 时间规则
	 */
	@Excel(name = "时间规则")
	@TableField("time_rule")
	@ColumnType(length=255)
	@ColumnComment("时间规则")
	private String timeRule;

	/**
	 * 时间HTML规则
	 */
	@Excel(name = "时间HTML规则")
	@TableField("time_html_rule")
	@ColumnType(length=255)
	@ColumnComment("timeHtml规则")
	private String timeHtmlRule;

	/**
	 * 内容规则
	 */
	@Excel(name = "内容规则")
	@TableField("content_rule")
	@ColumnType(length=255)
	@ColumnComment("contentRule")
	private String contentRule;

	/**
	 * 内容HTML规则
	 */
	@Excel(name = "内容HTML规则")
	@TableField("content_html_rule")
	@ColumnType(length=255)
	@ColumnComment("contentHtml规则")
	private String contentHtmlRule;

	/**
	 * 内容页开始
	 */
	@Excel(name = "内容页开始")
	@TableField("content_page_start")
	@ColumnType(length=255)
	@ColumnComment("contentPageStart")
	private String contentPageStart;

	/**
	 * 内容页结束
	 */
	@Excel(name = "内容页结束")
	@TableField("content_page_end")
	@ColumnType(length=255)
	@ColumnComment("内容页面结束")
	private String contentPageEnd;

	/**
	 * 内容页规则
	 */
	@Excel(name = "内容页规则")
	@TableField("content_page_rule")
	@ColumnType(length=255)
	@ColumnComment("contentPageRule")
	private Integer contentPageRule;

	/**
	 * 内容页
	 */
	@Excel(name = "内容页")
	@TableField("content_page")
	@ColumnType(length=255)
	@ColumnComment("contentPage")
	private Integer contentPage;

	/**
	 * 下一页内容
	 */
	@Excel(name = "下一页内容")
	@TableField("content_nextpage")
	@ColumnType(length=255)
	@ColumnComment("内容下一页")
	private String contentNextpage;

	/**
	 * 下载附件
	 */
	@Excel(name = "下载附件")
	@TableField("down_attachment")
	@ColumnType(length=255)
	@ColumnComment("向下附件")
	private Integer downAttachment;

	/**
	 * 水印
	 */
	@Excel(name = "水印")
	@TableField("watermark")
	@ColumnType(length=255)
	@ColumnComment("水印")
	private Integer watermark;

	/**
	 * 收集顺序
	 */
	@Excel(name = "收集顺序")
	@TableField("coll_order")
	@ColumnType(length=255)
	@ColumnComment("collOrder")
	private Integer collOrder;

	/**
	 * 自定义配置
	 */
	@Excel(name = "自定义配置")
	@TableField("customize_config")
	@ColumnType(length=255)
	@ColumnComment("customizeConfig")
	private String customizeConfig;
}
