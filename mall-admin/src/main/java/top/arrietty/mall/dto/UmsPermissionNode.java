package top.arrietty.mall.dto;

import java.util.List;

import top.arrietty.mall.model.UmsPermission;

public class UmsPermissionNode extends UmsPermission
{
	private List<UmsPermissionNode> children;

	public List<UmsPermissionNode> getChildren()
	{
		return children;
	}

	public void setChildren(List<UmsPermissionNode> children)
	{
		this.children = children;
	}
	
}
