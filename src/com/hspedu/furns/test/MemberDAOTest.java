package com.hspedu.furns.test;

import com.hspedu.furns.dao.impl.MemberDAOImpl;
import com.hspedu.furns.entity.Member;
import org.junit.Test;

public class MemberDAOTest {
    private MemberDAOImpl memberDAO = new MemberDAOImpl();
    @Test
    public void queryMemberByUsername() {
        if(memberDAO.queryMemberByUsername("king") == null) {
            System.out.println("该用户名不存在...");
        } else {
            System.out.println("该用户名存在...");
        }
    }
    @Test
    public void saveMember(){
        Member member = new Member(null, "king", "king", "12@qq.com");
        if(memberDAO.saveMember(member) == 1){
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
