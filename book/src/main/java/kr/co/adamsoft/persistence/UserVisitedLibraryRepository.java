package kr.co.adamsoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.adamsoft.model.UserVistedLibrary;

public interface UserVisitedLibraryRepository extends JpaRepository<UserVistedLibrary, Long> {
	
}
