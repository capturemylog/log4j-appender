package com.capturemylog.log4j;

import java.util.HashMap;

public class LogDataFactory {

	private static HashMap<String, ILogData> loggers = new HashMap<String, ILogData>();
	
	public static synchronized ILogData getILogData(String ownerGuid, String applicationGuid) {
		String key = ownerGuid + applicationGuid;
		ILogData logger = loggers.get(key);
		if( logger == null ) {
			logger = new LogDataImpl(ownerGuid, applicationGuid);
			loggers.put(key, logger);
		}
		return logger;
	}
}
