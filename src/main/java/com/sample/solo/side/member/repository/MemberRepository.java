package com.sample.solo.side.member.repository;

import com.sample.solo.side.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Optional<Member> findByLoginIdAndLoginPw(String loginId, String loginPw);
}
