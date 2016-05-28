package com.jo.common.container.loader;

import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jo.common.container.IServiceLoader;
import com.jo.dao.UserDao;
import com.jo.po.User;

public class SpringContextLoader implements IServiceLoader{

	private static final Logger logger = LogManager.getLogger(SpringContextLoader.class);
	
	private static ApplicationContext applicationContext;
	
	@Override
	public void loadService() {
		try {
			logger.info("开始加载Spring配置文件...");
			String[] classpaths = new String[] {
					"classpath*:spring/applicationContext.xml",
					"classpath*:spring/applicationContext-common-*.xml",
					"classpath*:spring/mybatis-config.xml"
			};
			applicationContext = new ClassPathXmlApplicationContext(classpaths);
			logger.info("已完成加载Spring配置文件");
		} catch(Exception e) {
			
		}
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringContextLoader loader = new SpringContextLoader();
		loader.loadService();
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		int id = 1;
		User user = userDao.selectByID(id);
		System.out.println(user.getName());
	}
}
