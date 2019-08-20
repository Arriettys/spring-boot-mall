package top.arrietty.mall.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.PmsProductCategory;
/**
 * 添加更新产品分类和其子类
 */
@Getter
@Setter
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory
{
	private List<PmsProductCategory> children;
}
