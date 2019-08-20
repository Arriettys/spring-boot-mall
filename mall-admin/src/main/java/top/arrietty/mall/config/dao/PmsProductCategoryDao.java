package top.arrietty.mall.config.dao;

import java.util.List;

import top.arrietty.mall.dto.PmsProductCategoryWithChildrenItem;

/**
 * 商品分类自定义Dao
 */
public interface PmsProductCategoryDao
{
	List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
