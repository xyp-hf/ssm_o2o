/**
 * 
 */
package com.imooc.o2o.entity;

import java.util.Date;

/**
 *　商品类别实体类
 * @author Yupeng.Xu
 * @date 2018年8月23日
 */
public class ProductCategory {
	
	/**
	 * 商品类别id
	 */
	private Long productCategoryId;
	
	/**
	 * 店铺id
	 */
	private Long shopId;
	
	/**
	 * 商品分类名称
	 */
	private String productCategoryName;
	
	/**
	 * 商品展示权重
	 */
	private Integer priority;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 最后一次更新时间
	 */
	private Date lastEditTime;

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
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

	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", shopId=" + shopId
				+ ", productCategoryName=" + productCategoryName + ", priority=" + priority + ", createTime="
				+ createTime + ", lastEditTime=" + lastEditTime + "]";
	}


}
