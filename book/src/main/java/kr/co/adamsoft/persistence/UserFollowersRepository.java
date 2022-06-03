package kr.co.adamsoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.adamsoft.model.UserFollowers;

public interface UserFollowersRepository extends JpaRepository<UserFollowers, Long> {

}
