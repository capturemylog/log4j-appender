package console;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;;

public class SimpleApp {

	private final static Logger logger = Logger.getLogger(SimpleApp.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("Hello World from SimpleApp");
		LogManager.shutdown();
	}

}
