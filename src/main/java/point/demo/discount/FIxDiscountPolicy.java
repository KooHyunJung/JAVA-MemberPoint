package point.demo.discount;

import point.demo.member.Grade;
import point.demo.member.Member;

public class FIxDiscountPolicy implements DiscountPolicy{

    // VIP 1000원 할인
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
