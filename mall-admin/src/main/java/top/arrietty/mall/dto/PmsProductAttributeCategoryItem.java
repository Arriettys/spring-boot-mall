package top.arrietty.mall.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.PmsProductAttribute;
import top.arrietty.mall.model.PmsProductAttributeCategory;
/**
 * 包含有分类下属性的dto
 */
@Getter
@Setter
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory
{
	private List<PmsProductAttribute> productAttributeList;
}
