package com.back.boundedContext.payout.out;

import com.back.boundedContext.payout.domain.PayoutMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PayoutMemberRepository extends JpaRepository<PayoutMember, Integer> {
    Optional<PayoutMember> findByUsername(String holding);
}
