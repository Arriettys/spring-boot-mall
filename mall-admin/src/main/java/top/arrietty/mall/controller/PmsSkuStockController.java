package top.arrietty.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.arrietty.mall.common.api.CommonResult;
import top.arrietty.mall.model.PmsSkuStock;
import top.arrietty.mall.service.PmsSkuStockService;

/**
 * sku库存Controller
 */
@Controller
@Api(tags = "PmsSkuStockController", description = "sku商品库存管理")
@RequestMapping("/sku")
public class PmsSkuStockController
{
	@Autowired
    private PmsSkuStockService skuStockService;

    @ApiOperation("根据商品编号及编号模糊搜索sku库存")
    @RequestMapping(value = "/{pid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsSkuStock>> getList(@PathVariable Long pid, @RequestParam(value = "keyword",required = false) String keyword) 
    {
        List<PmsSkuStock> skuStockList = skuStockService.getList(pid, keyword);
        return CommonResult.success(skuStockList);
    }
    @ApiOperation("批量更新库存信息")
    @RequestMapping(value ="/update/{pid}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long pid,@RequestBody List<PmsSkuStock> skuStockList)
    {
        int count = skuStockService.update(pid,skuStockList);
        if(count>0)
        {
            return CommonResult.success(count);
        }else
        {
            return CommonResult.failed();
        }
    }
}
