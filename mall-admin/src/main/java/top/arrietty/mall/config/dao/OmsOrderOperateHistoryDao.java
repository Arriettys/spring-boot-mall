package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.OmsOrderOperateHistory;

/**
 * 订单操作记录自定义Dao
 */
public interface OmsOrderOperateHistoryDao
{
	int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
