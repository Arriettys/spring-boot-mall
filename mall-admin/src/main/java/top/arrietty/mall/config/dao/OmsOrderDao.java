package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.dto.OmsOrderDeliveryParam;
import top.arrietty.mall.dto.OmsOrderDetail;
import top.arrietty.mall.dto.OmsOrderQueryParam;
import top.arrietty.mall.model.OmsOrder;

/**
 * 订单自定义查询Dao
 */
public interface OmsOrderDao
{
	/**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
