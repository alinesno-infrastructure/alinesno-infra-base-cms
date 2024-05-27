package com.alinesno.infra.base.cms.core;

/**
 * 内容类型
 *
 * @author Ocean
 * @version 1.0.0
 */
public interface IContentType extends Comparable<IContentType> {
	
	/**
	 * Bean名称前缀
	 */
	String BEAN_NAME_PREFIX = "ContentType_";

	/**
	 * 内容类型唯一标识ID
	 */
    String getId();

    /**
     * 内容类型名称
     */
    String getName();

    /**
     * 图标
     */
    default String getIcon() {
        return null;
    }

    /**
     * 内容扩展详情编辑组件
     */
    String getComponent();

    /**
     * 显示顺序
     */
    default int getOrder() {
        return 0;
    }

    @Override
    default int compareTo(IContentType o) {
        return this.getOrder() - o.getOrder();
    }


}
