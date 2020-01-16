package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.domain.Todo;
import com.my.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	TodoRepository todoRepository;
	
	
	@Override
	public List<Todo> list() {
		return todoRepository.findAll();
	}
}
