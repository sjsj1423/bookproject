package kr.co.adamsoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="book_tbl")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Book extends Base{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bno;
	
	private String title;
	private String bookImage;
	
}
