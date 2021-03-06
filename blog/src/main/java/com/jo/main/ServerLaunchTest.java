package com.jo.main;

import java.util.ServiceLoader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jo.common.container.IServiceLoader;

public class ServerLaunchTest {

//	private static final Logger logger = LogManager.getLogger(ServerLaunchTest.class);
	
	public static void main(String[] args) {

		try{
			final ServiceLoader<IServiceLoader> loader = ServiceLoader.load(IServiceLoader.class);
			Runtime.getRuntime().addShutdownHook(
					new Thread() {
						public void run() {
//							logger.info("Blog Service Stopping...");
							for(IServiceLoader service : loader) {
//								logger.info(service.getClass().getName()+".destory starting...");
								service.destory();
//								logger.info(service.getClass().getName()+".destory started...");
							}
//							logger.info("Blog Service Stopped!");
						}
						
					});
			
//			logger.info("Blog Service Starting...");
//			logger.info("Began to load all IServiceLoader implementation...");
			for(IServiceLoader service : loader) {
//				logger.info(service.getClass().getName()+".loadService starting...");
				service.loadService();
//				logger.info(service.getClass().getName()+".loadService started...");
			}
			
//			logger.info("Blog Service Sarted!");
			
		} catch(RuntimeException e) {
//			logger.error("Boot failure!!!!!!", e);
			System.exit(1);
		}
		
	}
}
