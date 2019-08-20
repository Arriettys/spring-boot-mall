package top.arrietty.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;

import top.arrietty.mall.mapper.SmsHomeNewProductMapper;
import top.arrietty.mall.model.SmsHomeNewProduct;
import top.arrietty.mall.model.SmsHomeNewProductExample;
import top.arrietty.mall.service.SmsHomeNewProductService;
/**
 * 首页新品推荐管理Service实现类
 */
@Service
public class SmsHomeNewProductServiceImpl implements SmsHomeNewProductService
{
	@Autowired
    private SmsHomeNewProductMapper homeNewProductMapper;
    @Override
    public int create(List<SmsHomeNewProduct> homeNewProductList) 
    {
        for (SmsHomeNewProduct SmsHomeNewProduct : homeNewProductList) 
        {
            SmsHomeNewProduct.setRecommendStatus(1);
            SmsHomeNewProduct.setSort(0);
            homeNewProductMapper.insert(SmsHomeNewProduct);
        }
        return homeNewProductList.size();
    }

    @Override
    public int updateSort(Long id, Integer sort) 
    {
        SmsHomeNewProduct homeNewProduct = new SmsHomeNewProduct();
        homeNewProduct.setId(id);
        homeNewProduct.setSort(sort);
        return homeNewProductMapper.updateByPrimaryKeySelective(homeNewProduct);
    }

    @Override
    public int delete(List<Long> ids) 
    {
        SmsHomeNewProductExample example = new SmsHomeNewProductExample();
        example.createCriteria().andIdIn(ids);
        return homeNewProductMapper.deleteByExample(example);
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) 
    {
        SmsHomeNewProductExample example = new SmsHomeNewProductExample();
        example.createCriteria().andIdIn(ids);
        SmsHomeNewProduct record = new SmsHomeNewProduct();
        record.setRecommendStatus(recommendStatus);
        return homeNewProductMapper.updateByExampleSelective(record,example);
    }

    @Override
    public List<SmsHomeNewProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum) 
    {
        PageHelper.startPage(pageNum,pageSize);
        SmsHomeNewProductExample example = new SmsHomeNewProductExample();
        SmsHomeNewProductExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(productName))
        {
            criteria.andProductNameLike("%"+productName+"%");
        }
        if(recommendStatus!=null)
        {
            criteria.andRecommendStatusEqualTo(recommendStatus);
        }
        example.setOrderByClause("sort desc");
        return homeNewProductMapper.selectByExample(example);
    }
}
