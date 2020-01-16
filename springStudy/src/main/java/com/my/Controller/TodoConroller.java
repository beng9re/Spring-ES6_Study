package com.my.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.domain.Todo;
import com.my.service.TodoService;

@RestController
@RequestMapping( value="/todo" ,produces = "application/json;charset=utf-8")
public class TodoConroller {
	
	@Autowired 
	TodoService todoService;
	
	
	@GetMapping("/list")
	public List<Todo> list(){
		return todoService.list();
	}
}
