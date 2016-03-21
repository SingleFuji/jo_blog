package com.jo.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jo.po.User;
import com.jo.util.JoConstants;

public class TestUserDao {

	static {
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("").toString());
	}

	// private static final String FILE_PATH =
	// "classpath:applicationContext.xml";
	private static final String FILE_PATH = "classpath:conf/mybatisContext.xml";

	// private static ApplicationContext context = new
	// ClassPathXmlApplicationContext(FILE_PATH);
	private static ApplicationContext context = new ClassPathXmlApplicationContext(JoConstants.LOADED_XML_FILES);

	private UserDao userDao = (UserDao) context.getBean("userDao");

	@Test
	public void testSelectByID() {

		int id = 1;
		User user = userDao.selectByID(id);
		System.out.println(user.getName());
	}

}
