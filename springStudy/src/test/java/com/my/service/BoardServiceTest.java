package com.my.service;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.my.domain.Board;
import com.my.domain.Code;
import com.my.domain.User;
import com.my.repository.BoardRepository;


@SpringBootTest
class BoardServiceTest {

	
	@Autowired 
	BoardRepository boardRepository;
	
	@Test
	void saveAndList() {
		List<Board> boardList = new ArrayList<Board>();
		
		Code gender = new Code();
		
		User user =  User.builder().birthDay(LocalDate.now()).userId("hi").userName("hi2").gender(gender).build();
	
		
		
		boardList.add(Board.builder().title("1st ±Û").content("ÄÁÅÙÃ÷1").regDt(LocalDate.now()).regId(user).build());
		boardList.add(Board.builder().title("2st ±Û").content("ÄÁÅÙÃ÷2").regDt(LocalDate.now()).regId(user).build());
		
		boardRepository.saveAll(boardList);
		
		boardRepository.findAll().forEach(System.out::println);
		
		assertEquals(boardRepository.findAll().size(), 2);
		
		
		
	}

}
