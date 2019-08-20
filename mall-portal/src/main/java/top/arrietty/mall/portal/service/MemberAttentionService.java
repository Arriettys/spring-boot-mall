package top.arrietty.mall.portal.service;

import java.util.List;

import top.arrietty.mall.portal.domain.MemberBrandAttention;

/**
 * 会员关注Service
 */
public interface MemberAttentionService
{
	/**
     * 添加关注
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 取消关注
     */
    int delete(Long memberId, Long brandId);

    /**
     * 获取用户关注列表
     */
    List<MemberBrandAttention> list(Long memberId);
}
