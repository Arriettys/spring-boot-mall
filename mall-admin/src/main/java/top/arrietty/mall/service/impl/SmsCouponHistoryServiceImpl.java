package top.arrietty.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;

import top.arrietty.mall.mapper.SmsCouponHistoryMapper;
import top.arrietty.mall.model.SmsCouponHistory;
import top.arrietty.mall.model.SmsCouponHistoryExample;
import top.arrietty.mall.service.SmsCouponHistoryService;
/**
 * 优惠券领取记录管理Service实现类
 */
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService
{
	@Autowired
    private SmsCouponHistoryMapper historyMapper;
    @Override
    public List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum) 
    {
        PageHelper.startPage(pageNum,pageSize);
        SmsCouponHistoryExample example = new SmsCouponHistoryExample();
        SmsCouponHistoryExample.Criteria criteria = example.createCriteria();
        if(couponId!=null)
        {
            criteria.andCouponIdEqualTo(couponId);
        }
        if(useStatus!=null)
        {
            criteria.andUseStatusEqualTo(useStatus);
        }
        if(!StringUtils.isEmpty(orderSn))
        {
            criteria.andOrderSnEqualTo(orderSn);
        }
        return historyMapper.selectByExample(example);
    }
}
