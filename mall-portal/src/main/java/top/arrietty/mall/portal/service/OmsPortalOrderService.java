package top.arrietty.mall.portal.service;

import org.springframework.transaction.annotation.Transactional;

import top.arrietty.mall.common.api.CommonResult;
import top.arrietty.mall.portal.domain.ConfirmOrderResult;
import top.arrietty.mall.portal.domain.OrderParam;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService
{
	/**
     * 根据用户购物车信息生成确认单信息
     */
    ConfirmOrderResult generateConfirmOrder();

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 支付成功后的回调
     */
    @Transactional
    CommonResult paySuccess(Long orderId);

    /**
     * 自动取消超时订单
     */
    @Transactional
    CommonResult cancelTimeOutOrder();

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * 发送延迟消息取消订单
     */
    void sendDelayMessageCancelOrder(Long orderId);
}
