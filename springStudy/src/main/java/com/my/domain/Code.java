package com.my.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="T_CODE")
public class Code {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String attr;
	private String codeValue;
	
	
}
