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
import top.arrietty.mall.portal.domain.MemberBrandAttention;
import top.arrietty.mall.portal.service.MemberAttentionService;

/**
 * 会员关注品牌管理Controller
 */
@Controller
@Api(tags = "MemberAttentionController", description = "会员关注品牌管理")
@RequestMapping("/member/attention")
public class MemberAttentionController
{
	@Autowired
    private MemberAttentionService memberAttentionService;
    @ApiOperation("添加品牌关注")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody MemberBrandAttention memberBrandAttention) 
    {
        int count = memberAttentionService.add(memberBrandAttention);
        if(count>0)
        {
            return CommonResult.success(count);
        }else
        {
            return CommonResult.failed();
        }
    }

    @ApiOperation("取消关注")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(Long memberId, Long brandId) 
    {
        int count = memberAttentionService.delete(memberId,brandId);
        if(count>0)
        {
            return CommonResult.success(count);
        }else
        {
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示关注列表")
    @RequestMapping(value = "/list/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberBrandAttention>> list(@PathVariable Long memberId) 
    {
        List<MemberBrandAttention> memberBrandAttentionList = memberAttentionService.list(memberId);
        return CommonResult.success(memberBrandAttentionList);
    }
}
