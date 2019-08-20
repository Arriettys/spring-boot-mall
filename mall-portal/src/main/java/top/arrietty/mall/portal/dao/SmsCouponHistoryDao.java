package top.arrietty.mall.portal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.portal.domain.SmsCouponHistoryDetail;

/**
 * 会员优惠券领取历史自定义Dao
 */
public interface SmsCouponHistoryDao
{
	List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);
}
