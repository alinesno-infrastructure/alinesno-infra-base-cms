package com.alinesno.infra.base.cms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 树结构节点实体类
 */
@Getter
@Setter
public class TreeNode<T> implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/** 节点ID */
	private T id;

	/** 节点父ID */
	private T parentId;

	/** 节点名称 */
	private String label;

	/**
	 * 是否顶级节点
	 */
	private boolean isRoot;

	/**
	 * 是否禁用
	 */
	private boolean disabled = false;

	/**
	 * 是否新节点，会不同颜色显示
	 */
	private boolean isNew = false;

	/**
	 * 是否默认展开
	 */
	private boolean isDefaultExpanded = false;

	/**
	 * 是否默认选中
	 */
	private boolean checked = false;

	/** 节点属性 */
	private Map<String, Object> props;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<TreeNode<T>> children;

	/**
	 * 构建树结构
	 */
	public static <T> List<TreeNode<T>> build(List<TreeNode<T>> list) {
		Map<T, List<TreeNode<T>>> mapChildren = list.stream().filter(n -> !n.isRoot)
				.collect(Collectors.groupingBy(TreeNode::getParentId));
		List<TreeNode<T>> result = new ArrayList<>();
		list.forEach(n -> {
			n.setChildren(mapChildren.get(n.getId()));
			if (n.isRoot) {
				result.add(n);
			}
		});
		return result;
	}

	public TreeNode(T nodeId, T parentId, String nodeName, boolean isRoot) {
		this.id = nodeId;
		this.parentId = parentId;
		this.label = nodeName;
		this.isRoot = isRoot;
	}

	public Map<String, Object> getProps() {
		if (props == null) {
			props = new HashMap<>();
		}
		return props;
	}
}
