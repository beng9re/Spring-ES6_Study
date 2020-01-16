package com.my.Controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
//import static org.hamcrest.Matchers.*;
	




@SpringBootTest
class TodoConrollerTest {

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	MockMvc mvc;
	
	
	@BeforeEach
	public void setUp() {
		mvc = webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	void todoListt() throws Exception{
	
		mvc.perform(get("/todo/list"))
											.andDo(print())
											.andExpect(status().isOk())
											.andExpect(jsonPath("$" , Matchers.iterableWithSize(2)));
											
	}

}
