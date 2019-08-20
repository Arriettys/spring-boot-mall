package top.arrietty.mall.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.arrietty.mall.model.UmsPermission;
import top.arrietty.mall.model.UmsRolePermissionRelation;

/**
 * 后台用户角色管理自定义Dao
 */
public interface UmsRolePermissionRelationDao
{
	/**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list")List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
