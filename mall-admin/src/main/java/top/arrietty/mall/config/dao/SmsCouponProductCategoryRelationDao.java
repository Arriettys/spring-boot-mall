package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.SmsCouponProductCategoryRelation;

/**
 * 优惠券和商品分类关系自定义Dao
 */
public interface SmsCouponProductCategoryRelationDao
{
	int insertList(@Param("list")List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
