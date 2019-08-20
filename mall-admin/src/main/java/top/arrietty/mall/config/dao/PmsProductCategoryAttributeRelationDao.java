package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.PmsProductCategoryAttributeRelation;

/**
 * 自定义商品分类和属性关系Dao
 */
public interface PmsProductCategoryAttributeRelationDao
{
	int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
