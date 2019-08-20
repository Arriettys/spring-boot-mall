package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.SmsCouponProductRelation;

/**
 * 优惠券和产品关系自定义Dao
 */
public interface SmsCouponProductRelationDao
{
	int insertList(@Param("list")List<SmsCouponProductRelation> productRelationList);
}
