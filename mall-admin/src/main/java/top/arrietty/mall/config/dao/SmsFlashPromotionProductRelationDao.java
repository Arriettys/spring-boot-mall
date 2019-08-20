package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.dto.SmsFlashPromotionProduct;

/**
 * 限时购商品关联自定义Dao
 */
public interface SmsFlashPromotionProductRelationDao
{
	/**
     * 获取限时购及相关商品信息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
