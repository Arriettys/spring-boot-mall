package top.arrietty.mall.service;

import java.util.List;

import top.arrietty.mall.model.OmsCompanyAddress;

/**
 * 收货地址管Service
 */
public interface OmsCompanyAddressService
{
	/**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
