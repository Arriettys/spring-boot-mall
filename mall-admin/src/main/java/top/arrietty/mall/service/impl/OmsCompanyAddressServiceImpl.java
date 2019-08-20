package top.arrietty.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.arrietty.mall.mapper.OmsCompanyAddressMapper;
import top.arrietty.mall.model.OmsCompanyAddress;
import top.arrietty.mall.model.OmsCompanyAddressExample;

/**
 * 收货地址管理Service实现类
 */
@Service
public class OmsCompanyAddressServiceImpl
{
	@Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    public List<OmsCompanyAddress> list() 
    {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
