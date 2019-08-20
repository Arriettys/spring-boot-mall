package top.arrietty.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 查询单个产品进行修改时返回的结果
 */
@Getter
@Setter
public class PmsProductResult extends PmsProductParam
{
	//商品所选分类的父id
    private Long cateParentId;
}
