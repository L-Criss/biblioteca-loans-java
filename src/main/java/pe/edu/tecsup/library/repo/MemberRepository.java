package pe.edu.tecsup.library.repo;

import pe.edu.tecsup.library.model.Member;
import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findById(String id);
    void save(Member member);
}
