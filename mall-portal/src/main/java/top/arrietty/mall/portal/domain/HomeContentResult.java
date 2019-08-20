package top.arrietty.mall.portal.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import top.arrietty.mall.model.CmsSubject;
import top.arrietty.mall.model.PmsBrand;
import top.arrietty.mall.model.PmsProduct;
import top.arrietty.mall.model.SmsHomeAdvertise;

/**
 * 首页内容返回信息封装
 */
@Getter
@Setter
public class HomeContentResult
{
	//轮播广告
    private List<SmsHomeAdvertise> advertiseList;
    //推荐品牌
    private List<PmsBrand> brandList;
    //当前秒杀场次
    private HomeFlashPromotion homeFlashPromotion;
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    private List<PmsProduct> hotProductList;
    //推荐专题
    private List<CmsSubject> subjectList;
}
