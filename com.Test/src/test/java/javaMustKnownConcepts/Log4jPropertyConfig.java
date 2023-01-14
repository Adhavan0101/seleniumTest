package javaMustKnownConcepts;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;

public class Log4jPropertyConfig {

	static Logger logger = Logger.getLogger(Log4jPropertyConfig.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4J.properties");

		logger.debug("This is Debug logger");
		logger.info("This is Info logger");
		logger.warn("This is Warn logger");
		logger.error("This is Error logger");
		logger.fatal("This is fatal logger");

	}

}
