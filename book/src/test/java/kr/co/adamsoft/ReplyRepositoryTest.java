package kr.co.adamsoft;

import java.util.stream.IntStream;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.adamsoft.model.Book;
import kr.co.adamsoft.model.Member;
import kr.co.adamsoft.model.Reply;
import kr.co.adamsoft.persistence.ReplyRepository;

@SpringBootTest
public class ReplyRepositoryTest {

	@Autowired
	private ReplyRepository replyRepository;
	
	@Test
	public void insertReply() {
		IntStream.rangeClosed(1, 100).forEach(i->{
			Member member = Member.builder().email("user"+i+"aaa.com").build();
			Book book = Book.builder().title("title"+i).build();
			Reply reply = Reply.builder()
					.content("Content..." + i)
					.member(member)
					.book(book)
					.build();
			replyRepository.save(reply);
		});
	}
}
