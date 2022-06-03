package kr.co.adamsoft;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.adamsoft.model.Member;
import kr.co.adamsoft.model.UserFollowers;
import kr.co.adamsoft.persistence.UserFollowersRepository;

@SpringBootTest
public class UserFollowersRepositoryTest {

	@Autowired
	private UserFollowersRepository userfollowersRepository;
	
	@Test
	public void insertUserFollwers() {
		IntStream.rangeClosed(1, 100).forEach(i->{
			Member member = Member.builder().email("user20@aaa.com").build();
			UserFollowers userFollowers = UserFollowers.builder()
					.member(member)
					.ToUser("follower"+i)
					.build();
			
			userfollowersRepository.save(userFollowers);
		});
	}
}
