package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.PmsMemberPrice;

/**
 * 自定义会员价格Dao
 */
public interface PmsMemberPriceDao
{
	int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
