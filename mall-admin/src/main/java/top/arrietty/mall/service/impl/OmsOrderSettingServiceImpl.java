package top.arrietty.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.arrietty.mall.mapper.OmsOrderSettingMapper;
import top.arrietty.mall.model.OmsOrderSetting;
import top.arrietty.mall.service.OmsOrderSettingService;
/**
 * 订单设置管理Service实现类
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService
{
	@Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) 
    {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) 
    {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
