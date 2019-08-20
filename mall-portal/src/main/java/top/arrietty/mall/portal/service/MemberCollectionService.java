package top.arrietty.mall.portal.service;

import java.util.List;

import top.arrietty.mall.portal.domain.MemberProductCollection;

/**
 * 会员收藏Service
 */
public interface MemberCollectionService
{
	int addProduct(MemberProductCollection productCollection);

    int deleteProduct(Long memberId, Long productId);

    List<MemberProductCollection> listProduct(Long memberId);
}
