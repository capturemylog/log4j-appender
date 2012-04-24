package com.capturemylog.log4j;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.ErrorCode;
import org.apache.log4j.spi.LoggingEvent;

public class AzureLogAppender extends AppenderSkeleton {
	
	/* these parameters will be read from the log4j.properties file */
	private boolean enableScreenshot;
	private String ownerGuid;
	private String applicationGuid;
	
	public AzureLogAppender() {
		super();
	}

	@Override
	public void close() {
		if(this.closed) 
		{ // closed is defined in AppenderSkeleton
			return;
		}
		this.closed = true;
	}

	@Override
	public boolean requiresLayout() {
		return true;
	}

	@Override
	protected void append(LoggingEvent event) {
		if(this.layout == null) {
			errorHandler.error("No layout set for the appender named ["+ name+"].", null, ErrorCode.MISSING_LAYOUT);
			return;
		}
	
		String logLevel = event.getLevel().toString();
		String logMessage = buildLogMessage(event);

		ILogData ld = LogDataFactory.getILogData(getOwnerGuid(), getApplicationGuid());
		if( enableScreenshot ) {
			ld.LogDataWithScreenshot(logLevel, logMessage);
		} else {
			ld.LogDataWithoutScreenshot(logLevel, logMessage);
		}
	}
	
	private String buildLogMessage(LoggingEvent event) {
		// if our layout does not handle exceptions, we have to do it.
		StringBuffer buf = new StringBuffer();
		buf.append(this.layout.format(event));
		if(layout.ignoresThrowable()) {
			String[] t = event.getThrowableStrRep();
			if (t != null) {
				int len = t.length;
				for(int i = 0; i < len; i++) {
					buf.append(t[i]);
				}
			}
		}
		return buf.toString();
	}
	

	public String getOwnerGuid() {
		return ownerGuid;
	}

	public void setOwnerGuid(String ownerGuid) {
		this.ownerGuid = ownerGuid;
	}

	public String getApplicationGuid() {
		return applicationGuid;
	}

	public void setApplicationGuid(String applicationGuid) {
		this.applicationGuid = applicationGuid;
	}

	public String getEnableScreenshot() {
		return Boolean.toString(enableScreenshot);
	}

	public void setEnableScreenshot(String enableScreenshot) {
		this.enableScreenshot = Boolean.parseBoolean(enableScreenshot);
		if( !(enableScreenshot.equalsIgnoreCase("true") || enableScreenshot.equalsIgnoreCase("false")) ) {
			// TODO: log warning
		}
	}

}
