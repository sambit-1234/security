package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@EnableWebMvc
@ComponentScan(basePackages = {"com.security"})
public class webConfig {

	@Bean
	public  InternalResourceViewResolver resolver() {
		return new InternalResourceViewResolver("WEB-INF",".jsp");
	}
}
