package com.my.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.domain.Todo;
import com.my.service.TodoService;

@RestController
public class TodoConroller {
	
	@Autowired 
	TodoService todoService;
	
	@GetMapping("/todo/list")
	public Todo list(){
		List<Todo>  todos =  todoService.list();

		return todos.get(0);
	}
	
	@GetMapping("/todo/lists")
	public Todo lists(){
		List<Todo>  todos =  todoService.list();
		
		
		
		return  todos.get(1);
	}
	
	@GetMapping("/todo/test")
	public Map<String,Object> test () {
		Map<String, Object> test =new HashMap<String, Object>();
		test.put("test",1);
		test.put("test",2);
		test.put("test",3);
		test.put("test",4);
		
		return test;
		
		
	}
}
