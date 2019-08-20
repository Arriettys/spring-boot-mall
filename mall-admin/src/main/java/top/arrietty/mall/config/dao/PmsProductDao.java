package top.arrietty.mall.config.dao;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.dto.PmsProductResult;

/**
 * 商品自定义Dao
 */
public interface PmsProductDao
{
	/**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
