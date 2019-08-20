package top.arrietty.mall.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import top.arrietty.mall.dto.PmsProductCategoryParam;
import top.arrietty.mall.dto.PmsProductCategoryWithChildrenItem;
import top.arrietty.mall.model.PmsProductCategory;

/**
 * 产品分类Service
 */
public interface PmsProductCategoryService
{
	@Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    int delete(Long id);

    PmsProductCategory getItem(Long id);

    int updateNavStatus(List<Long> ids, Integer navStatus);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
