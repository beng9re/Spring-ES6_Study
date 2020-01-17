package com.my.domain;

import java.time.LocalDate;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;

import com.my.domain.Todo.TodoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
@Table(name="User")
public class User {
	
	@Id
	private String userId;
	private String userName;
	
	@OneToOne
	@JoinColumn(name="gender_id")
	private Code gender;
	
	@Convert(converter = LocalDateConverter.class)
	private LocalDate birthDay;
	
	@Convert(converter = LocalDateConverter.class)
	private LocalDate regDt;
	
	

}
