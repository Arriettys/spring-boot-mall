package top.arrietty.mall.dto;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.SmsFlashPromotionSession;

/**
 * 包含商品数量的场次信息
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession
{
	private Long productCount;

	public Long getProductCount()
	{
		return productCount;
	}

	public void setProductCount(Long productCount)
	{
		this.productCount = productCount;
	}
}
