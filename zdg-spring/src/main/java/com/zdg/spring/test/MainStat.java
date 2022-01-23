package com.zdg.spring.test;

import com.zdg.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * @Author zdg
 * @Description TODO
 */
@Configuration
@ComponentScan("com.zdg.spring")
public class MainStat {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainStat.class);
		UserService userService = context.getBean(UserService.class);
		userService.sayHi();

	}

}
