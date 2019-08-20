package top.arrietty.mall.service;

import java.util.List;

import top.arrietty.mall.dto.PmsProductAttributeCategoryItem;
import top.arrietty.mall.model.PmsProductAttributeCategory;

/**
 * 商品属性分类Service
 */
public interface PmsProductAttributeCategoryService
{
	int create(String name);

    int update(Long id, String name);

    int delete(Long id);

    PmsProductAttributeCategory getItem(Long id);

    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
