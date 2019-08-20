package top.arrietty.mall.portal.domain;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 首页当前秒杀场次信息
 */
@Getter
@Setter
public class HomeFlashPromotion
{
	private Date startTime;
    private Date endTime;
    private Date nextStartTime;
    private Date nextEndTime;
    //属于该秒杀活动的商品
    private List<FlashPromotionProduct> productList;
}
