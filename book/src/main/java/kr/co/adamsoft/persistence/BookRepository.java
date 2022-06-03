package kr.co.adamsoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.adamsoft.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	
}
