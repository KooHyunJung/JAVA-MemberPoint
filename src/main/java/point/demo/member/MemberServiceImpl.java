package point.demo.member;

// 구현체
public class MemberServiceImpl implements MemberService {

//    회원을 가입시키고 조회하기 위해서 MemberRepository 필요.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
