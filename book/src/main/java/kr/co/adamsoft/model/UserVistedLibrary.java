package kr.co.adamsoft.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table (name="visted_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude="member")
public class UserVistedLibrary extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Vno;
	
	
	@ManyToOne (fetch = FetchType.LAZY)
	private Member member;
	
}
