package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.domain.Board;
import com.my.repository.BoardRepository;


@Service
public class BoardServiceImp implements BoardService{
	
	@Autowired
	BoardRepository boardRepository;

	
	public List<Board> boardAllList() {
		return boardRepository.findAll();
	}

}
