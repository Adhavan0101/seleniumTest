package javaMustKnownConcepts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4JBasicConfig {

	static Logger logger = Logger.getLogger(Log4JBasicConfig.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		logger.debug("This is Debug logger");
		logger.info("This is Info logger");
		logger.warn("This is Warning logger");
		logger.error("This is Error logger");
		logger.fatal("This is Fatal logger");

	}

}
