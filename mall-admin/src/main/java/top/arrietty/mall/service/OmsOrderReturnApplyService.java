package top.arrietty.mall.service;

import java.util.List;

import top.arrietty.mall.dto.OmsOrderReturnApplyResult;
import top.arrietty.mall.dto.OmsReturnApplyQueryParam;
import top.arrietty.mall.dto.OmsUpdateStatusParam;
import top.arrietty.mall.model.OmsOrderReturnApply;

/**
 * 退货申请管理Service
 */
public interface OmsOrderReturnApplyService
{
	/**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
