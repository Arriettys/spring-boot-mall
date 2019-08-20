package top.arrietty.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品分类对应属性信息
 */
@Getter
@Setter
public class ProductAttrInfo
{
	private Long attributeId;
    private Long attributeCategoryId;
}
