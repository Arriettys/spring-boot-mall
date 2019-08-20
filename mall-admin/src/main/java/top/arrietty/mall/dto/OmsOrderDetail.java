package top.arrietty.mall.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.OmsOrder;
import top.arrietty.mall.model.OmsOrderItem;
import top.arrietty.mall.model.OmsOrderOperateHistory;
/**
 * 订单详情信息
 */
public class OmsOrderDetail extends OmsOrder
{
	@Getter
	@Setter
	private List<OmsOrderItem> orderItemList;
	@Getter
	@Setter
	private List<OmsOrderOperateHistory> historyList;
}
