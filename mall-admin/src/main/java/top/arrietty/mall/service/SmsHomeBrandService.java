package top.arrietty.mall.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import top.arrietty.mall.model.SmsHomeBrand;

/**
 * 首页品牌管理Service
 */
public interface SmsHomeBrandService
{
	/**
     * 添加首页品牌推荐
     */
    @Transactional
    int create(List<SmsHomeBrand> homeBrandList);

    /**
     * 修改品牌推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除品牌推荐
     */
    int delete(List<Long> ids);

    /**
     * 更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询品牌推荐
     */
    List<SmsHomeBrand> list(String brandName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
