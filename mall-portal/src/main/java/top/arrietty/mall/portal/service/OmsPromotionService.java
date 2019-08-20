package top.arrietty.mall.portal.service;

import java.util.List;

import top.arrietty.mall.model.OmsCartItem;
import top.arrietty.mall.portal.domain.CartPromotionItem;

/**
 * 促销管理Service
 */
public interface OmsPromotionService
{
	/**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
