package com.jo.cache.redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jo.po.User;
import com.jo.util.JoConstants;

public class TestRedisObjectService {

	private static final String FILE_PATH = "classpath:applicationContext.xml";
//	private static final String FILE_PATH = "classpath:conf/redisContext.xml";
	
//	private static ApplicationContext context = new ClassPathXmlApplicationContext(FILE_PATH);
	private static ApplicationContext context = new ClassPathXmlApplicationContext(JoConstants.LOADED_XML_FILES);

	private RedisObjectService redisObjectService = (RedisObjectService) context.getBean("redisObjectService");
	
	@Test
	public void testPutObject() {
		User user = new User();
		user.setId("1");
		user.setName("good");
		String key = "jojo";
		redisObjectService.putObject(key, user);
		
		User tmp = (User) redisObjectService.getObject(key);
		System.out.println(tmp.getName());
	}

}
