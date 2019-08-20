package top.arrietty.mall.dto;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.OmsCompanyAddress;
import top.arrietty.mall.model.OmsOrderReturnApply;
/**
 * 申请信息封装
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply
{
	@Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
