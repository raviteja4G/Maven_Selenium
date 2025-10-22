package Lib;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class reporter {
	
	//LogManager log = LogManager.getLogManager();
		private static final Logger log = LogManager.getLogger(reporter.class);
		
		static {
	        // Force console logging even if no log4j2.xml file is present
	        Configurator.setRootLevel(Level.INFO);
	    }
		
		public static void info(String message) {
			log.info(message);
			
		}
		
		public static void pass(String message) {
			log.info(message);
		}
		
		public static void fail(String message) {
			log.error(message);
		}

}
