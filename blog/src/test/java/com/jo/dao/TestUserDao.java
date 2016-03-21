package com.jo.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jo.po.User;

public class TestUserDao {

//	private static final String FILE_PATH = "classpath:applicationContext.xml";
	private static final String FILE_PATH = "classpath:conf/mybatisContext.xml";
	
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext(FILE_PATH);

	private UserDao userDao = (UserDao) context.getBean("userDao");
	
	@Test
	public void testSelectByID() {
		int id = 1;
		User user = userDao.selectByID(id);
		System.out.println(user.getName());
	}

}
