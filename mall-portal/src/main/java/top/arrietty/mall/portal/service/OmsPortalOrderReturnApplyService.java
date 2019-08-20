package top.arrietty.mall.portal.service;

import top.arrietty.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 */
public interface OmsPortalOrderReturnApplyService
{
	/**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
