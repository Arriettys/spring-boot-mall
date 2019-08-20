package top.arrietty.mall.portal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.OmsOrderItem;

/**
 * 订单商品信息自定义Dao
 */
public interface PortalOrderItemDao
{
	int insertList(@Param("list") List<OmsOrderItem> list);
}
