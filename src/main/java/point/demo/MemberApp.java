package point.demo;

import point.demo.member.Grade;
import point.demo.member.Member;
import point.demo.member.MemberService;
import point.demo.member.MemberServiceImpl;

// 간단한 테스트 코드
// 기능 검증 코드이나 눈으로 확인하는 한계가 있음.
public class MemberApp {

//  단축키 psvm + enter
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

//      단축키 soutv + enter
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

    }
}
