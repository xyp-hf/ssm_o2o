package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 区域实体类
 * @author Yupeng.Xu
 * @date 2018年8月23日
 */
public class Area {
	/**
	 * 区域Id
	 */
	private Integer areaId;

	/**
	 * 区域名称
	 */
	private String areaName;

	/**
	 * 权重 用来排序 权重越大排序越靠前
	 */
	private Integer priority;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date lastEditTime;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

}
