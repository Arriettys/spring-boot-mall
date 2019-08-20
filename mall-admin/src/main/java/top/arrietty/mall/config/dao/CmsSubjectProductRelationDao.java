package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.CmsSubjectProductRelation;

/**
 * 自定义商品和专题关系操作
 */
public interface CmsSubjectProductRelationDao
{
	int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
