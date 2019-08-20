package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.CmsPrefrenceAreaProductRelation;

/**
 * 自定义优选和商品关系操作
 */
public interface CmsPrefrenceAreaProductRelationDao
{
	int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
