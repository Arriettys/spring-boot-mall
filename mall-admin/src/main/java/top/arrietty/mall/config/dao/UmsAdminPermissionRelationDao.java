package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.UmsAdminPermissionRelation;

/**
 * 用户权限自定义Dao
 */
public interface UmsAdminPermissionRelationDao
{
	int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
