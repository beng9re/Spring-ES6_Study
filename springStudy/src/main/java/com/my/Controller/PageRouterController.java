package com.my.Controller;

import java.net.URI;
import java.net.URL;
import java.util.Map;

import org.apache.el.stream.Stream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageRouterController {
	
	
	@RequestMapping("main/{packageName}/{routePage}")
	public String mainRouter(@PathVariable Map<String, String> pathMap) {
		
		pathMap.forEach((key,value)-> {System.out.printf("key:: %s value:: %s\n", key,value);});

		return pathMap.get("packageName") +"/"+pathMap.get("routePage");
	}
	
	
	
	
}
