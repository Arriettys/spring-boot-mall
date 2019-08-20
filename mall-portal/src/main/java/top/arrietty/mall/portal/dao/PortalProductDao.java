package top.arrietty.mall.portal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.portal.domain.CartProduct;
import top.arrietty.mall.portal.domain.PromotionProduct;

/**
 * 前台系统自定义商品Dao
 */
public interface PortalProductDao
{
	CartProduct getCartProduct(@Param("id") Long id);
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);
}
