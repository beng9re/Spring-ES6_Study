package com.my.domain;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
@Table(name="T_BOARD")
@Entity
public class Board {
	
	@GeneratedValue
	@Id
	private Long id;
	private String title;
	private String content;
	private String category;
	private String regId;
	private LocalDate regDt;
	private String modifyId;
	private LocalDate modifyDt;
	

}
