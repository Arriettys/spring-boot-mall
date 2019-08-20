package top.arrietty.mall.portal.domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.PmsProduct;
/**
 * 秒杀信息和商品对象封装
 */
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct
{
	private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}
