package com.jo.common.logger.log4j;

import org.apache.logging.log4j.Level;

public class Log4jLogger {

	private org.apache.logging.log4j.Logger logger;
	
	public Log4jLogger(Class<?> key){
		logger = org.apache.logging.log4j.LogManager.getLogger(key);
	}
	
	public Log4jLogger(String key){
		logger = org.apache.logging.log4j.LogManager.getLogger(key);
	}
	
	public boolean isLevel(Level level) {
		// TODO Auto-generated method stub
		return false;
	}

	public void log(Level level, String msg, String chainId) {
		// TODO Auto-generated method stub
		logger.log(level, msg);
	}

	public void log(Level level, String msg, Throwable e, String chainId) {
		// TODO Auto-generated method stub
		logger.log(level, msg, e);
	}

	public void log(Level level, String msg) {
		logger.log(level, msg);
	}

	public void log(Level level, String msg, Throwable e) {
		logger.log(level, msg, e);
	}

	public void bindChainId(String parentChainId, String childChainId) {
		// TODO Auto-generated method stub

	}

	public void trace(String msg) {
		logger.trace(msg);
	}

	public void trace(Throwable e) {
		logger.trace(e);
	}

	public void trace(String msg, Throwable e) {
		logger.trace(msg, e);
	}

	public void debug(String msg) {
		logger.debug(msg);
	}

	public void debug(Throwable e) {
		logger.debug(e);
	}

	public void debug(String msg, Throwable e) {
		logger.debug(msg, e);
	}

	public void info(String msg) {
		logger.info(msg);
	}

	public void info(Throwable e) {
		logger.info(e);
	}

	public void info(String msg, Throwable e) {
		logger.info(msg, e);
	}

	public void warn(String msg) {
		logger.warn(msg);
	}

	public void warn(Throwable e) {
		logger.warn(e);
	}

	public void warn(String msg, Throwable e) {
		logger.warn(msg, e);
	}

	public void error(String msg) {
		logger.error(msg);
	}

	public void error(Throwable e) {
		logger.error(e);
	}

	public void error(String msg, Throwable e) {
		logger.error(msg, e);
	}

	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

}
