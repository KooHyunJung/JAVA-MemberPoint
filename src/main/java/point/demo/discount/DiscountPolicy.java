package point.demo.discount;

import point.demo.member.Member;

public interface DiscountPolicy {

    //  필요 파라미터 넘겨준다.

    /**
     *
     * @param member
     * @param price
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}
