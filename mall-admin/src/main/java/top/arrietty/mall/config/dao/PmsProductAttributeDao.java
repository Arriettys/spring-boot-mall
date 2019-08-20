package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.dto.ProductAttrInfo;

/**
 * 自定义商品属性Dao
 */
public interface PmsProductAttributeDao
{
	List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
