package com.jo.main;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jo.dao.UserDao;
import com.jo.po.User;
import com.jo.util.JoConstants;

public class TempLaunch {

	public static void main(String[] args) {
		String classpath = Thread.currentThread().getContextClassLoader().getResource("").toString();
		System.out.println(classpath);

		ApplicationContext context = new ClassPathXmlApplicationContext(JoConstants.LOADED_XML_FILES);

		UserDao userDao = (UserDao) context.getBean("userDao");

		int id = 1;
		User user = userDao.selectByID(id);
		System.out.println(user.getName());
	}
}
