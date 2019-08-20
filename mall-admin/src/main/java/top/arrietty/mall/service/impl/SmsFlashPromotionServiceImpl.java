package top.arrietty.mall.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;

import top.arrietty.mall.mapper.SmsFlashPromotionMapper;
import top.arrietty.mall.model.SmsFlashPromotion;
import top.arrietty.mall.model.SmsFlashPromotionExample;
import top.arrietty.mall.service.SmsFlashPromotionService;
/**
 * 限时购活动管理Service实现类
 */
@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService
{
	@Autowired
    private SmsFlashPromotionMapper flashPromotionMapper;

    @Override
    public int create(SmsFlashPromotion flashPromotion) 
    {
        flashPromotion.setCreateTime(new Date());
        return flashPromotionMapper.insert(flashPromotion);
    }

    @Override
    public int update(Long id, SmsFlashPromotion flashPromotion) 
    {
        flashPromotion.setId(id);
        return flashPromotionMapper.updateByPrimaryKey(flashPromotion);
    }

    @Override
    public int delete(Long id) 
    {
        return flashPromotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateStatus(Long id, Integer status) 
    {
        SmsFlashPromotion flashPromotion = new SmsFlashPromotion();
        flashPromotion.setId(id);
        flashPromotion.setStatus(status);
        return flashPromotionMapper.updateByPrimaryKeySelective(flashPromotion);
    }

    @Override
    public SmsFlashPromotion getItem(Long id) 
    {
        return flashPromotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum) 
    {
        PageHelper.startPage(pageNum, pageSize);
        SmsFlashPromotionExample example = new SmsFlashPromotionExample();
        if (!StringUtils.isEmpty(keyword)) 
        {
            example.createCriteria().andTitleLike("%" + keyword + "%");
        }
        return flashPromotionMapper.selectByExample(example);
    }
}
