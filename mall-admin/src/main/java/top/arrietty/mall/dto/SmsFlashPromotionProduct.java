package top.arrietty.mall.dto;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.PmsProduct;
import top.arrietty.mall.model.SmsFlashPromotionProductRelation;
/**
 * 限时购及商品信息封装
 */
@Getter
@Setter
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation
{
    private PmsProduct product;
}
