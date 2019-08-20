package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.PmsProductAttributeValue;

/**
 * 商品参数，商品自定义规格属性Dao
 */
public interface PmsProductAttributeValueDao
{
	int insertList(@Param("list")List<PmsProductAttributeValue> productAttributeValueList);
}
