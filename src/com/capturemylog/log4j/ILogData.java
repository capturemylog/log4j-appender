package com.capturemylog.log4j;

public interface ILogData {

	public void LogDataWithScreenshot(String logType, String logString);
	
	public void LogDataWithoutScreenshot(String logType, String logString);
	
	public int LogCount();
}
