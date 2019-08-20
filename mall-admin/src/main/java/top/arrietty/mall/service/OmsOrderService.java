package top.arrietty.mall.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import top.arrietty.mall.dto.OmsMoneyInfoParam;
import top.arrietty.mall.dto.OmsOrderDeliveryParam;
import top.arrietty.mall.dto.OmsOrderDetail;
import top.arrietty.mall.dto.OmsOrderQueryParam;
import top.arrietty.mall.dto.OmsReceiverInfoParam;
import top.arrietty.mall.model.OmsOrder;

/**
 * 订单管理Service
 */
public interface OmsOrderService
{
	/**
     * 订单查询
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量发货
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     */
    @Transactional
    int close(List<Long> ids, String note);

    /**
     * 批量删除订单
     */
    int delete(List<Long> ids);

    /**
     * 获取指定订单详情
     */
    OmsOrderDetail detail(Long id);

    /**
     * 修改订单收货人信息
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改订单备注
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}
