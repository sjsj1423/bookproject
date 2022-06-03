package kr.co.adamsoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.adamsoft.model.UserLibrary;

public interface UserLibraryRepository extends JpaRepository<UserLibrary, Long> {

}
