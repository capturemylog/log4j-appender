package com.capturemylog.log4j;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.capturemylog.ws.logdata.LogData;
import com.capturemylog.ws.logdata.LogDataSoap;
import com.capturemylog.ws.logdata.LogObject;
import com.capturemylog.ws.logpicture.LogPicture;
import com.capturemylog.ws.logpicture.LogPictureSoap;

public class LogDataImpl implements ILogData {
	private static final boolean asyncData = false;
	private static final boolean asyncPicture = false;

	private final String ownerGuid;
	private final String applicationGuid;
	private final String deviceName;

	private final LogDataSoap ldSoap;
	private final LogPictureSoap lpSoap;

	public LogDataImpl(String ownerGuid, String applicationGuid) {
		this.ownerGuid = ownerGuid;
		this.applicationGuid = ownerGuid;
		String hostname;
		try {
			hostname = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			hostname = "Unknown";
		}
		this.deviceName = hostname;

		this.ldSoap = new LogData().getLogDataSoap();
		this.lpSoap = new LogPicture().getLogPictureSoap();
	}

	@Override
	public void LogDataWithoutScreenshot(String logType, String logString) {
		try {
			String guid = UUID.randomUUID().toString();
			boolean haveContent = false;
			
			LogData(logType, logString, guid, haveContent);
		} catch (Exception e) {
			// TODO: log exception
		}
	}

	@Override
	public void LogDataWithScreenshot(String logType, String logString) {
		try {
			String guid = UUID.randomUUID().toString();
			boolean haveContent = true;

			LogData(logType, logString, guid, haveContent);
			LogScreenshot(guid);
		} catch (Exception e) {
			// TODO: log exception
		}
	}
	
	@Override
	public int LogCount() {
		try {
			return ldSoap.logCount(ownerGuid);
		} catch (Exception e) {
			// TODO: log exception
			return -1;
		}
	}

	private void LogData(String logType, String logString, String guid, boolean haveContent ) 
	throws Exception {
		LogObject lo = new LogObject();

		/* set GUID's */
		lo.setGUID(guid);
		lo.setGUIDOwner(ownerGuid);
		lo.setApplicationGUID(applicationGuid);

		/* set device name and date */
		lo.setDeviceName(deviceName);
		lo.setDeviceDate(getCurrentDate());

		lo.setLoggingString(logString);
		lo.setLogType(logType);
		
		lo.setHaveByteContent(haveContent);

		if( asyncData ) {
			ldSoap.logNewDataAsync(lo);
		} else {
			ldSoap.logNewData(lo);
		}
	}
	
	private void LogScreenshot(String guid) {
		try {
			Robot robot = new Robot();
			Rectangle screenRectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage screenImage = robot.createScreenCapture(screenRectangle);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			ImageIO.write(screenImage, "bmp", baos);
			
			if( asyncPicture ) {
				lpSoap.logDataAsync(guid, ownerGuid, baos.toByteArray());
			} else {
				lpSoap.logData(guid, ownerGuid, baos.toByteArray());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private XMLGregorianCalendar getCurrentDate() 
			throws Exception {
		GregorianCalendar c = new GregorianCalendar();
		c.setTimeInMillis(System.currentTimeMillis());
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	}

	public static void main(String [] args) 
			throws Exception {
		final String guid = "423946b3-03e9-40fb-8da9-be4e89bdf114";

		LogDataImpl ld = new LogDataImpl(guid, guid);

		ld.LogDataWithScreenshot("info", "log message from ``void LogDataWSWrapper::main(String [] args)''");
		
		System.out.println("You have " + ld.LogCount() + " log messages.");
	}

}
