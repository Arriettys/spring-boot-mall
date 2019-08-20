package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.dto.OmsOrderReturnApplyResult;
import top.arrietty.mall.dto.OmsReturnApplyQueryParam;
import top.arrietty.mall.model.OmsOrderReturnApply;

/**
 * 订单退货申请自定义Dao
 */
public interface OmsOrderReturnApplyDao
{
	/**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
