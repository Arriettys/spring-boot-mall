package top.arrietty.mall.portal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import top.arrietty.mall.portal.domain.MemberProductCollection;
/**
 * 商品收藏Repository
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection,String>
{
	MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);
    int deleteByMemberIdAndProductId(Long memberId,Long productId);
    List<MemberProductCollection> findByMemberId(Long memberId);
}
