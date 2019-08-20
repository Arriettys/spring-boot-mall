package top.arrietty.mall.portal.domain;

import java.util.List;

import top.arrietty.mall.model.PmsProduct;
import top.arrietty.mall.model.PmsProductAttribute;
import top.arrietty.mall.model.PmsSkuStock;

/**
 * 购物车中选择规格的商品信息
 */
public class CartProduct extends PmsProduct
{
	private List<PmsProductAttribute> productAttributeList;
    private List<PmsSkuStock> skuStockList;
	public List<PmsProductAttribute> getProductAttributeList()
	{
		return productAttributeList;
	}
	public void setProductAttributeList(List<PmsProductAttribute> productAttributeList)
	{
		this.productAttributeList = productAttributeList;
	}
	public List<PmsSkuStock> getSkuStockList()
	{
		return skuStockList;
	}
	public void setSkuStockList(List<PmsSkuStock> skuStockList)
	{
		this.skuStockList = skuStockList;
	}
}
