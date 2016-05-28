package com.jo.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Addition {

	private static final Logger logger = LogManager.getLogger(Addition.class);
	
	public static void testLogger()
	{
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
	
	public static void main(String[] args) {
		testLogger();
	}
}
