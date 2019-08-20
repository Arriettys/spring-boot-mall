package top.arrietty.mall.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * 修改订单费用信息参数
 */
public class OmsMoneyInfoParam
{
	private Long orderId;
	private BigDecimal freightAmount;
	private BigDecimal discountAmount;
	private Integer status;
	public Long getOrderId()
	{
		return orderId;
	}
	public void setOrderId(Long orderId)
	{
		this.orderId = orderId;
	}
	public BigDecimal getFreightAmount()
	{
		return freightAmount;
	}
	public void setFreightAmount(BigDecimal freightAmount)
	{
		this.freightAmount = freightAmount;
	}
	public BigDecimal getDiscountAmount()
	{
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount)
	{
		this.discountAmount = discountAmount;
	}
	public Integer getStatus()
	{
		return status;
	}
	public void setStatus(Integer status)
	{
		this.status = status;
	}
}
