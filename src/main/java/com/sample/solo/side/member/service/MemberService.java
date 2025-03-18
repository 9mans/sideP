package com.sample.solo.side.member.service;

import com.sample.solo.side.member.entity.Member;

public interface MemberService {

    void save(String name, String loginId, String loginPw);

    Member find(String loginId, String loginPw);
}
