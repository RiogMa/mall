package com.hspedu.furns.dao;

import com.hspedu.furns.entity.Member;

public interface MemberDAO {
    // 根据用户名返回对应的 Member
    public Member queryMemberByUsername(String username);
    // 保存 Member 对象到数据库/表 member 表
    public int saveMember(Member member);
    /**
     * 根据用户名和密码返回 Member
     */
    public Member queryMemberByUsernameAndPassword(String username, String password);
}
