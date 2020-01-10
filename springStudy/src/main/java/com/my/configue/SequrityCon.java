package com.my.configue;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SequrityCon extends WebSecurityConfigurerAdapter{
	
	@Override
	
	public void configure(WebSecurity web) throws Exception {
		/*웹도메인 리소스 Configuration*/
		web.ignoring().antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**","/**");
	}
	

}
