package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.PmsProductFullReduction;

/**
 * 自定义商品满减Dao
 */
public interface PmsProductFullReductionDao
{
	int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
