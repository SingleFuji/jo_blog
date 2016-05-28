package com.jo.common.logger.log4j;

import java.io.File;
import java.util.Map;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.appender.RollingFileAppender;

import com.jo.common.logger.Level;
import com.jo.common.logger.Logger;
import com.jo.common.logger.LoggerAdapter;

public class Log4jLoggerAdapter implements LoggerAdapter {

	private File file;
	
	public Log4jLoggerAdapter() {
        try {
            org.apache.logging.log4j.core.Logger logger = (org.apache.logging.log4j.core.Logger) org.apache.logging.log4j.LogManager
                    .getRootLogger();
            Map<String, Appender> map = logger.getAppenders();
            Appender appender = null;
            for (Map.Entry<String, Appender> entry : map.entrySet()) {
                appender = entry.getValue();
                if (appender instanceof RollingFileAppender) {
                    String filename = ((RollingFileAppender) appender).getFileName();
                    file = new File(filename);
                    break;
                }
            }
        } catch (Throwable t) {
        }

    }
	
	public Logger getLogger(Class<?> key) {
//		return new Log4jLogger(key);
		return null;
	}

	@Override
	public Logger getLogger(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLevel(Level level) {
		// TODO Auto-generated method stub

	}

	@Override
	public Level getLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFile(File file) {
		// TODO Auto-generated method stub

	}

}
