package kr.co.adamsoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.adamsoft.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
