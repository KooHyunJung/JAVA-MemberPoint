package point.demo.member;

import java.util.Map;

import java.util.HashMap;

// 구현체
// DB 연결이 아닌 메모리에서만 진행하기 때문에 demo 용도로 사용.
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
