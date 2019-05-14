package com.jt.test;

import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jt.pojo.User;
import com.jt.service.UserService;
public class TestSpring {
	@Test
	public void testSpring(){
		ApplicationContext context=
		new ClassPathXmlApplicationContext("/spring/application-1.xml");
		UserService userService=
		context.getBean(UserService.class);
		List<User> userList=
		userService.findAll();
		System.out.println(userList);
		
	}
}
