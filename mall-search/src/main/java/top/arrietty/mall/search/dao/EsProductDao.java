package top.arrietty.mall.search.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.search.domain.EsProduct;


/**
 * 搜索系统中的商品管理自定义Dao
 */
public interface EsProductDao
{
	List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
