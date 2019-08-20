package top.arrietty.mall.config.dao;

import java.util.List;

import top.arrietty.mall.dto.PmsProductAttributeCategoryItem;

/**
 * 自定义商品属性分类Dao
 */
public interface PmsProductAttributeCategoryDao
{
	List<PmsProductAttributeCategoryItem> getListWithAttr();
}
