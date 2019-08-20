package top.arrietty.mall.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.arrietty.mall.common.api.CommonPage;
import top.arrietty.mall.common.api.CommonResult;
import top.arrietty.mall.dto.PmsBrandDto;
import top.arrietty.mall.model.PmsBrand;
import top.arrietty.mall.service.DemoService;

/**
 * 测试controller
 */
@Api(value = "demo", description = "demo详情")
@Controller
public class DemoController
{
	@Autowired
    private DemoService demoService;

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @ApiOperation(value = "获取全部品牌列表")
    @RequestMapping(value = "/brand/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList() 
    {
        return CommonResult.success(demoService.listAllBrand());
    }

    @ApiOperation(value = "添加品牌")
    @RequestMapping(value = "/brand/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createBrand(@Validated @RequestBody PmsBrandDto pmsBrand, BindingResult result) 
    {
        if (result.hasErrors()) 
        {
            return CommonResult.validateFailed(result.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count = demoService.createBrand(pmsBrand);
        if (count == 1) 
        {
            commonResult = CommonResult.success(pmsBrand);
            log.debug("createBrand success:{}", pmsBrand);
        } else 
        {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createBrand failed:{}", pmsBrand);
        }
        return commonResult;
    }

    @ApiOperation(value = "更新品牌")
    @RequestMapping(value = "/brand/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Long id, @Validated @RequestBody PmsBrandDto pmsBrandDto,BindingResult result) 
    {
        if(result.hasErrors())
        {
            return CommonResult.validateFailed(result.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count = demoService.updateBrand(id, pmsBrandDto);
        if (count == 1) 
        {
            commonResult = CommonResult.success(pmsBrandDto);
            log.debug("updateBrand success:{}", pmsBrandDto);
        } else 
        {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateBrand failed:{}", pmsBrandDto);
        }
        return commonResult;
    }

    @ApiOperation(value = "删除品牌")
    @RequestMapping(value = "/brand/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id) 
    {
        int count = demoService.deleteBrand(id);
        if (count == 1) 
        {
            log.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else 
        {
            log.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation(value = "分页获取品牌列表")
    @RequestMapping(value = "/brand/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) 
    {
        List<PmsBrand> brandList = demoService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation(value = "根据编号查询品牌信息")
    @RequestMapping(value = "/brand/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) 
    {
        return CommonResult.success(demoService.getBrand(id));
    }
}
