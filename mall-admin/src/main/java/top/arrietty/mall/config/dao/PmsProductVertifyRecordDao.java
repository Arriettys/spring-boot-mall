package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.PmsProductVertifyRecord;

/**
 * 商品审核日志自定义dao
 */
public interface PmsProductVertifyRecordDao
{
	int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
