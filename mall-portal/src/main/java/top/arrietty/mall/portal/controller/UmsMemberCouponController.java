package top.arrietty.mall.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import top.arrietty.mall.common.api.CommonResult;
import top.arrietty.mall.model.SmsCouponHistory;
import top.arrietty.mall.portal.domain.CartPromotionItem;
import top.arrietty.mall.portal.domain.SmsCouponHistoryDetail;
import top.arrietty.mall.portal.service.OmsCartItemService;
import top.arrietty.mall.portal.service.UmsMemberCouponService;
import top.arrietty.mall.portal.service.UmsMemberService;

/**
 * 用户优惠券管理Controller
 */
@Controller
@Api(tags = "UmsMemberCouponController", description = "用户优惠券管理")
@RequestMapping("/member/coupon")
public class UmsMemberCouponController
{
	@Autowired
    private UmsMemberCouponService memberCouponService;
    @Autowired
    private OmsCartItemService cartItemService;
    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("领取指定优惠券")
    @RequestMapping(value = "/add/{couponId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@PathVariable Long couponId) 
    {
        return memberCouponService.add(couponId);
    }

    @ApiOperation("获取用户优惠券列表")
    @ApiImplicitParam(name = "useStatus", value = "优惠券筛选类型:0->未使用；1->已使用；2->已过期",
            allowableValues = "0,1,2", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SmsCouponHistory>> list(@RequestParam(value = "useStatus", required = false) Integer useStatus) 
    {
        List<SmsCouponHistory> couponHistoryList = memberCouponService.list(useStatus);
        return CommonResult.success(couponHistoryList);
    }

    @ApiOperation("获取登录会员购物车的相关优惠券")
    @ApiImplicitParam(name = "type", value = "使用可用:0->不可用；1->可用",
            defaultValue = "1", allowableValues = "0,1", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/list/cart/{type}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SmsCouponHistoryDetail>> listCart(@PathVariable Integer type) 
    {
        List<CartPromotionItem> cartPromotionItemList = cartItemService.listPromotion(memberService.getCurrentMember().getId());
        List<SmsCouponHistoryDetail> couponHistoryList = memberCouponService.listCart(cartPromotionItemList, type);
        return CommonResult.success(couponHistoryList);
    }
}
