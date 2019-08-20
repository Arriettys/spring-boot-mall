package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.PmsProductLadder;

/**
 * 自定义会员阶梯价格Dao
 */
public interface PmsProductLadderDao
{
	int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
