package point.demo;

import point.demo.member.Grade;
import point.demo.member.Member;
import point.demo.member.MemberService;
import point.demo.member.MemberServiceImpl;
import point.demo.order.Order;
import point.demo.order.OrderService;
import point.demo.order.OrderServiceImpl;

public class OrderApp {
    // 테스트 환경에서 하는 것이 좋은나.. 잠시 main 에서 테스트 진행.
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}
