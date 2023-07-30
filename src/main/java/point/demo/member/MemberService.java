package point.demo.member;

// 회원 기능: 회원 가입, 회원 조회
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
