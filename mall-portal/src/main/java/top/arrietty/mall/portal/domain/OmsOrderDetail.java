package top.arrietty.mall.portal.domain;

import java.util.List;

import top.arrietty.mall.model.OmsOrder;
import top.arrietty.mall.model.OmsOrderItem;
/**
 * 包含订单商品信息的订单详情on 2018/9/4.
 */
public class OmsOrderDetail extends OmsOrder
{
	private List<OmsOrderItem> orderItemList;

	public List<OmsOrderItem> getOrderItemList()
	{
		return orderItemList;
	}

	public void setOrderItemList(List<OmsOrderItem> orderItemList)
	{
		this.orderItemList = orderItemList;
	}
}
