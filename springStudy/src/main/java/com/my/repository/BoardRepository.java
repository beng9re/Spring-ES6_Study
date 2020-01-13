package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.my.domain.Board;
																						/* domain +  pk*/
public interface BoardRepository  extends  JpaRepository<Board,Long> {

	
}
