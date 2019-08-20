package top.arrietty.mall.portal.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import top.arrietty.mall.common.api.CommonResult;
import top.arrietty.mall.model.SmsCouponHistory;
import top.arrietty.mall.portal.domain.CartPromotionItem;
import top.arrietty.mall.portal.domain.SmsCouponHistoryDetail;

/**
 * 用户优惠券管理Service
 */
public interface UmsMemberCouponService
{
	/**
     * 会员添加优惠券
     */
    @Transactional
    CommonResult add(Long couponId);

    /**
     * 获取优惠券列表
     * @param useStatus 优惠券的使用状态
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
