package com.hspedu.furns.test;

import com.hspedu.furns.entity.Member;
import com.hspedu.furns.service.MemberService;
import com.hspedu.furns.service.impl.MemberServiceImpl;
import org.junit.Test;

public class MemberServiceTest {
    private MemberService memberService = new MemberServiceImpl();
    // 测试注册用户
    @Test
    public void testRegisterMember() {
        if(memberService.isExistsUsername("m1ary")){
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }
    @Test
    public void registerMember() {
        // 构建一个用户
        Member member = new Member(null, "m1ary", "mary", "mary@qq.com");
        if(memberService.registerMember(member)){
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }
    }
}
