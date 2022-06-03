package kr.co.adamsoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.adamsoft.model.Member;

public interface MemberRepository extends JpaRepository<Member, String>{

}
