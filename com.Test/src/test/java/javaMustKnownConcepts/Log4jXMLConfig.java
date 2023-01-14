package javaMustKnownConcepts;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jXMLConfig {

	static Logger logger = Logger.getLogger(Log4jXMLConfig.class);

	public static void main(String[] args) {

		DOMConfigurator.configure("log4j.xml");

		logger.debug("This is Debug logger");
		logger.info("This is Info logger");
		logger.warn("This is Warn logger");
		logger.error("This is Error logger");
		logger.fatal("This is fatal logger");
	}

}
