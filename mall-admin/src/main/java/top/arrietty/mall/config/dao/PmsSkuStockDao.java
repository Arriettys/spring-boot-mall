package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.PmsSkuStock;

/**
 * 自定义商品sku库存Dao
 */
public interface PmsSkuStockDao
{
	/**
     * 批量插入操作
     */
    int insertList(@Param("list")List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替换操作
     */
    int replaceList(@Param("list")List<PmsSkuStock> skuStockList);
}
