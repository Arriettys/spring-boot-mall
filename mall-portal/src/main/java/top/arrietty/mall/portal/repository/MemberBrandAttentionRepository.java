package top.arrietty.mall.portal.repository;

import java.util.List;

import top.arrietty.mall.portal.domain.MemberBrandAttention;

/**
 * 会员关注Repository
 */
public interface MemberBrandAttentionRepository
{
	MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);
    int deleteByMemberIdAndBrandId(Long memberId,Long brandId);
    List<MemberBrandAttention> findByMemberId(Long memberId);
}
