package kr.co.adamsoft;

import java.util.Optional;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.adamsoft.model.Member;
import kr.co.adamsoft.persistence.MemberRepository;

@SpringBootTest
public class MemberRepositorytest {
	@Autowired
	private MemberRepository memberRepository;
	
	//@Test
	public void insertMembers() {
		IntStream.rangeClosed(1, 100).forEach(i->{
			Member member = Member.builder()
					.email("user" + i + "@aaa.com")
					.birthdate("1111111")
					.nickname("USER" + i)
					.userMembership(true)
					.memberStatus("회원가입")
					.build();
			
			memberRepository.save(member);
		});
	}
	
	//@Test
	public void readMember() {
		Optional<Member> result = memberRepository.findById("user10@aaa.com");
		Member member = result.get();
		System.out.println(member);
		System.out.println(member.getNickname());
	}
	
}
