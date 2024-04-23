package com.hspedu.furns.service;

import com.hspedu.furns.entity.Member;

public interface MemberService {
    // 注册用户
    public boolean registerMember(Member member);
    // 判断用户名是否存在
    public boolean isExistsUsername(String username);
    /**
     * 根据登录传入的 member 信息，返回对应的在 DB 中的 member 对象
     * @param member 是根据用户登录构建一个 member
     * @return 返回的是对应的 db 中的 member 对象，如果不存在,返回 null
     */
    public Member login(Member member);
}
