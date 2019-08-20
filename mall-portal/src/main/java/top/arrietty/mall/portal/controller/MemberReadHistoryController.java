package top.arrietty.mall.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.arrietty.mall.common.api.CommonResult;
import top.arrietty.mall.portal.domain.MemberReadHistory;
import top.arrietty.mall.portal.service.MemberReadHistoryService;

/**
 * 会员商品浏览记录管理Controller
 */
@Controller
@Api(tags = "MemberReadHistoryController", description = "会员商品浏览记录管理")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController
{
	@Autowired
    private MemberReadHistoryService memberReadHistoryService;

    @ApiOperation("创建浏览记录")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) 
    {
        int count = memberReadHistoryService.create(memberReadHistory);
        if (count > 0) 
        {
            return CommonResult.success(count);
        } else 
        {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除浏览记录")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<String> ids) 
    {
        int count = memberReadHistoryService.delete(ids);
        if (count > 0) 
        {
            return CommonResult.success(count);
        } else 
        {
            return CommonResult.failed();
        }
    }

    @ApiOperation("展示浏览记录")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberReadHistory>> list(Long memberId) 
    {
        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
        return CommonResult.success(memberReadHistoryList);
    }
}
