package top.arrietty.mall.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.arrietty.mall.model.CmsTopic;
import top.arrietty.mall.model.CmsTopicExample;

public interface CmsTopicMapper {
    long countByExample(CmsTopicExample example);

    int deleteByExample(CmsTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsTopic record);

    int insertSelective(CmsTopic record);

    List<CmsTopic> selectByExampleWithBLOBs(CmsTopicExample example);

    List<CmsTopic> selectByExample(CmsTopicExample example);

    CmsTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByExample(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByPrimaryKeySelective(CmsTopic record);

    int updateByPrimaryKeyWithBLOBs(CmsTopic record);

    int updateByPrimaryKey(CmsTopic record);
}