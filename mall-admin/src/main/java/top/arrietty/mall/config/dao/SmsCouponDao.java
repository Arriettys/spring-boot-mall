package top.arrietty.mall.config.dao;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.dto.SmsCouponParam;

/**
 * 优惠券管理自定义查询Dao
 */
public interface SmsCouponDao
{
	SmsCouponParam getItem(@Param("id") Long id);
}
