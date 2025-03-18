package com.sample.solo.side.member.service;

import com.sample.solo.side.member.entity.Member;
import com.sample.solo.side.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    // save()는 jpaRepository의 메서드 객체가 존재하지 않으면 인서트, 객체가 존재한다면 업데이트
    @Override
    public void save(String name, String loginId, String loginPw) {
        memberRepository.save(new Member(name, loginId, loginPw));
    }

    // 조회 결과가 없을 수도 있는 경우(리턴 값이 존재하지 않을 수 있는 경우) optional 객체를 사용하면 안전하게 처리가능
    @Override
    public Member find(String loginId, String loginPw) {
        Optional<Member> memberOptional = memberRepository.findByLoginIdAndLoginPw(loginId, loginPw);

        return memberOptional.orElse(null);
    }
}
