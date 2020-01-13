package com.my.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board/")
public class BoardController {
	
	@GetMapping("list")
	public Map<String,?> list(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		String arr[] = {"aaaa","aaca","aaxa"};
		
		map.put("test", "aa");
		map.put("ars", 1);
		map.put("vale", 1);
		map.put("arr", arr);
		
		return map;
	}

}
