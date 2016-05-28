package com.jo.main;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;

public class TestLogger {

	private static final Logger logger = LogManager.getLogger(TestLogger.class);
	
	public static void main(String[] args) {
//		logger.trace("trace");
//		logger.debug("debug");
//		logger.info("info");
//		logger.warn("warn");
//		logger.error("error");
//		System.out.println("++++");
//		Addition.testLogger();
		
		String time = "2016-05-09T15:43:48";
		DateTime dt = new DateTime(time);
		Date jdkDate = dt.toDate();
		System.out.println(jdkDate.toString());
	}
}
