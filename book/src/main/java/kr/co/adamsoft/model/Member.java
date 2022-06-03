package kr.co.adamsoft.model;

import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name ="member_tbl")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Member extends BaseEntity {
	@Id
	private String email;
	
	private String nickname;
	private String birthdate;
	private boolean userMembership;
	private String memberStatus;
	
	
	
}
