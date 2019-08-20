package top.arrietty.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import top.arrietty.mall.config.dao.PmsSkuStockDao;
import top.arrietty.mall.mapper.PmsSkuStockMapper;
import top.arrietty.mall.model.PmsSkuStock;
import top.arrietty.mall.model.PmsSkuStockExample;
import top.arrietty.mall.service.PmsSkuStockService;
/**
 * 商品sku库存管理Service实现类
 */
@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService
{
	@Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsSkuStockDao skuStockDao;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) 
    {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) 
        {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) 
    {
        return skuStockDao.replaceList(skuStockList);
    }
}
