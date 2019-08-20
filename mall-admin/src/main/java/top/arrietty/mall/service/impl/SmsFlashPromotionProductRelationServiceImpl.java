package top.arrietty.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import top.arrietty.mall.config.dao.SmsFlashPromotionProductRelationDao;
import top.arrietty.mall.dto.SmsFlashPromotionProduct;
import top.arrietty.mall.mapper.SmsFlashPromotionProductRelationMapper;
import top.arrietty.mall.model.SmsFlashPromotionProductRelation;
import top.arrietty.mall.model.SmsFlashPromotionProductRelationExample;
import top.arrietty.mall.service.SmsFlashPromotionProductRelationService;
/**
 * 限时购商品关联管理Service实现类
 */
@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService
{
	@Autowired
    private SmsFlashPromotionProductRelationMapper relationMapper;
    @Autowired
    private SmsFlashPromotionProductRelationDao relationDao;
    @Override
    public int create(List<SmsFlashPromotionProductRelation> relationList) 
    {
        for (SmsFlashPromotionProductRelation relation : relationList) 
        {
            relationMapper.insert(relation);
        }
        return relationList.size();
    }

    @Override
    public int update(Long id, SmsFlashPromotionProductRelation relation) 
    {
        relation.setId(id);
        return relationMapper.updateByPrimaryKey(relation);
    }

    @Override
    public int delete(Long id) 
    {
        return relationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SmsFlashPromotionProductRelation getItem(Long id) 
    {
        return relationMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum) 
    {
        PageHelper.startPage(pageNum,pageSize);
        return relationDao.getList(flashPromotionId,flashPromotionSessionId);
    }

    @Override
    public long getCount(Long flashPromotionId, Long flashPromotionSessionId) 
    {
        SmsFlashPromotionProductRelationExample example = new SmsFlashPromotionProductRelationExample();
        example.createCriteria()
                .andFlashPromotionIdEqualTo(flashPromotionId)
                .andFlashPromotionSessionIdEqualTo(flashPromotionSessionId);
        return relationMapper.countByExample(example);
    }
}
