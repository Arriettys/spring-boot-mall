package top.arrietty.mall.search.service;

import java.util.List;

import org.springframework.data.domain.Page;

import top.arrietty.mall.search.domain.EsProduct;
import top.arrietty.mall.search.domain.EsProductRelatedInfo;

/**
 * 商品搜索管理Service
 */
public interface EsProductService
{
	/**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据id删除商品
     */
    void delete(Long id);

    /**
     * 根据id创建商品
     */
    EsProduct create(Long id);

    /**
     * 批量删除商品
     */
    void delete(List<Long> ids);

    /**
     * 根据关键字搜索名称或者副标题
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 根据关键字搜索名称或者副标题复合查询
     */
    Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize,Integer sort);

    /**
     * 根据商品id推荐相关商品
     */
    Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize);

    /**
     * 获取搜索词相关品牌、分类、属性
     */
    EsProductRelatedInfo searchRelatedInfo(String keyword);
}
