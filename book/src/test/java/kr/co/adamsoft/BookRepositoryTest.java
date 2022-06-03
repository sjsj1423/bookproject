package kr.co.adamsoft;


import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.adamsoft.model.Book;
import kr.co.adamsoft.persistence.BookRepository;

@SpringBootTest
public class BookRepositoryTest {
	
	@Autowired
	private BookRepository bookRepository;

	//@Test
	public void insertBook() {
		IntStream.rangeClosed(1, 100).forEach(i->{
			
			Book book = Book.builder()
					.title("title"+i)
					.bookImage(UUID.randomUUID().toString())
					.build();
			bookRepository.save(book);
		});
	}
	
	@Test
	public void readBook() {
		Optional<Book> result = bookRepository.findById(925L);
		Book book = result.get();
		
		System.out.println(book);
		System.out.println(book.getBookImage());
		
	}
}
