package point.demo.order;

import point.demo.discount.DiscountPolicy;
import point.demo.discount.FIxDiscountPolicy;
import point.demo.member.Member;
import point.demo.member.MemberRepository;
import point.demo.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FIxDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        // 만자 회원 조회
        Member member = memberRepository.findById(memberId);
        // 조회한 회원 정보 + 상품 가격 discountPolicy 넘기기.
        // 단일 책임이 잘 설계 되었기에 할인에 대한건 할인 정책을 가지고 있는 discountPolicy 코드만 변경하면 된다.
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
