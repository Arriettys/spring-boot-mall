package top.arrietty.mall.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.arrietty.mall.common.api.CommonResult;
import top.arrietty.mall.portal.domain.MemberProductCollection;
import top.arrietty.mall.portal.service.MemberCollectionService;

/**
 * 会员收藏管理Controller
 */
@Controller
@Api(tags = "MemberCollectionController", description = "会员收藏管理")
@RequestMapping("/member/collection")
public class MemberCollectionController
{
	@Autowired
    private MemberCollectionService memberCollectionService;

    @ApiOperation("添加商品收藏")
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addProduct(@RequestBody MemberProductCollection productCollection) 
    {
        int count = memberCollectionService.addProduct(productCollection);
        if (count > 0) 
        {
            return CommonResult.success(count);
        } else 
        {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除收藏商品")
    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteProduct(Long memberId, Long productId) 
    {
        int count = memberCollectionService.deleteProduct(memberId, productId);
        if (count > 0) 
        {
            return CommonResult.success(count);
        } else 
        {
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示关注列表")
    @RequestMapping(value = "/listProduct/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberProductCollection>> listProduct(@PathVariable Long memberId) 
    {
        List<MemberProductCollection> memberProductCollectionList = memberCollectionService.listProduct(memberId);
        return CommonResult.success(memberProductCollectionList);
    }
}
