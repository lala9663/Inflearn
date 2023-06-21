package hello.core;

import hello.core.member.*;
import hello.core.order.*;

public class OrderApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl();

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Long memberId1 = 2L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Order order1 = orderService.createOrder(memberId1, "itemB", 8000);

        System.out.println("order = " + order);
        System.out.println("order = " + order1);

    }
}