package top.arrietty.mall.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import top.arrietty.mall.model.SmsHomeRecommendSubject;

/**
 * 首页专题推荐管理Service
 */
public interface SmsHomeRecommendSubjectService
{
	/**
     * 添加首页推荐
     */
    @Transactional
    int create(List<SmsHomeRecommendSubject> recommendSubjectList);

    /**
     * 修改推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除推荐
     */
    int delete(List<Long> ids);

    /**
     * 更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询推荐
     */
    List<SmsHomeRecommendSubject> list(String subjectName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
