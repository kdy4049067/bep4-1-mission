package com.back.boundedContext.payout.out;

import com.back.boundedContext.payout.domain.PayoutCandidateItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayoutCandidateItemRepository extends JpaRepository<PayoutCandidateItem, Integer> {
}
