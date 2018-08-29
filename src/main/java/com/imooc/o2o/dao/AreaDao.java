/**
 * 
 */
package com.imooc.o2o.dao;

import java.util.List;

import com.imooc.o2o.entity.Area;

/**
 * 
 * @author Yupeng.Xu
 * @date 2018年8月23日
 */
public interface AreaDao {
	/**
	 * 列出区域列表
	 * @return areaList
	 */
	List<Area> queryArea();

}
