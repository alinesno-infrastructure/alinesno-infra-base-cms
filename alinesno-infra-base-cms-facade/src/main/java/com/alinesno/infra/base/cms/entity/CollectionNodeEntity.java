package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

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
@TableName("collection_node")
public class CollectionNodeEntity extends InfraBaseEntity {

	// Fields

	/**
	 * 节点ID
	 */
	@Excel(name = "节点ID")
	@TableField("nodeid")
	private Integer nodeid;

	/**
	 * 名称
	 */
	@Excel(name = "名称")
	@TableField("name")
	private String name;

	/**
	 * 最后日期
	 */
	@Excel(name = "最后日期")
	@TableField("lastdate")
	private Integer lastdate;

	/**
	 * 站点ID
	 */
	@Excel(name = "站点ID")
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 源字符集
	 */
	@Excel(name = "源字符集")
	@TableField("sourcecharset")
	private String sourcecharset;

	/**
	 * 源类型
	 */
	@Excel(name = "源类型")
	@TableField("sourcetype")
	private Integer sourcetype;

	/**
	 * URL页面
	 */
	@Excel(name = "URL页面")
	@TableField("urlpage")
	private String urlpage;

	/**
	 * 页面大小开始
	 */
	@Excel(name = "页面大小开始")
	@TableField("pagesize_start")
	private Integer pagesizeStart;

	/**
	 * 页面大小结束
	 */
	@Excel(name = "页面大小结束")
	@TableField("pagesize_end")
	private Integer pagesizeEnd;

	/**
	 * 页面基础
	 */
	@Excel(name = "页面基础")
	@TableField("page_base")
	private String pageBase;

	/**
	 * 参数数量
	 */
	@Excel(name = "参数数量")
	@TableField("par_num")
	private Integer parNum;

	/**
	 * URL包含
	 */
	@Excel(name = "URL包含")
	@TableField("url_contain")
	private String urlContain;

	/**
	 * URL排除
	 */
	@Excel(name = "URL排除")
	@TableField("url_except")
	private String urlExcept;

	/**
	 * URL开始
	 */
	@Excel(name = "URL开始")
	@TableField("url_start")
	private String urlStart;

	/**
	 * URL结束
	 */
	@Excel(name = "URL结束")
	@TableField("url_end")
	private String urlEnd;

	/**
	 * 标题规则
	 */
	@Excel(name = "标题规则")
	@TableField("title_rule")
	private String titleRule;

	/**
	 * 标题HTML规则
	 */
	@Excel(name = "标题HTML规则")
	@TableField("title_html_rule")
	private String titleHtmlRule;

	/**
	 * 作者规则
	 */
	@Excel(name = "作者规则")
	@TableField("author_rule")
	private String authorRule;

	/**
	 * 作者HTML规则
	 */
	@Excel(name = "作者HTML规则")
	@TableField("author_html_rule")
	private String authorHtmlRule;

	/**
	 * 来源规则
	 */
	@Excel(name = "来源规则")
	@TableField("comeform_rule")
	private String comeformRule;

	/**
	 * 来源HTML规则
	 */
	@Excel(name = "来源HTML规则")
	@TableField("comeform_html_rule")
	private String comeformHtmlRule;

	/**
	 * 时间规则
	 */
	@Excel(name = "时间规则")
	@TableField("time_rule")
	private String timeRule;

	/**
	 * 时间HTML规则
	 */
	@Excel(name = "时间HTML规则")
	@TableField("time_html_rule")
	private String timeHtmlRule;

	/**
	 * 内容规则
	 */
	@Excel(name = "内容规则")
	@TableField("content_rule")
	private String contentRule;

	/**
	 * 内容HTML规则
	 */
	@Excel(name = "内容HTML规则")
	@TableField("content_html_rule")
	private String contentHtmlRule;

	/**
	 * 内容页开始
	 */
	@Excel(name = "内容页开始")
	@TableField("content_page_start")
	private String contentPageStart;

	/**
	 * 内容页结束
	 */
	@Excel(name = "内容页结束")
	@TableField("content_page_end")
	private String contentPageEnd;

	/**
	 * 内容页规则
	 */
	@Excel(name = "内容页规则")
	@TableField("content_page_rule")
	private Integer contentPageRule;

	/**
	 * 内容页
	 */
	@Excel(name = "内容页")
	@TableField("content_page")
	private Integer contentPage;

	/**
	 * 下一页内容
	 */
	@Excel(name = "下一页内容")
	@TableField("content_nextpage")
	private String contentNextpage;

	/**
	 * 下载附件
	 */
	@Excel(name = "下载附件")
	@TableField("down_attachment")
	private Integer downAttachment;

	/**
	 * 水印
	 */
	@Excel(name = "水印")
	@TableField("watermark")
	private Integer watermark;

	/**
	 * 收集顺序
	 */
	@Excel(name = "收集顺序")
	@TableField("coll_order")
	private Integer collOrder;

	/**
	 * 自定义配置
	 */
	@Excel(name = "自定义配置")
	@TableField("customize_config")
	private String customizeConfig;

}
