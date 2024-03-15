package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    //JPQL 쿼리 생성 : select m from Member m where m.name = :name
    List<Member> findByName(String name);
}
