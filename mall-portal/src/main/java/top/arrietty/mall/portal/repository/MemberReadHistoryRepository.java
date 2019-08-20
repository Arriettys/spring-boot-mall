package top.arrietty.mall.portal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import top.arrietty.mall.portal.domain.MemberReadHistory;

public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String>
{
	List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
