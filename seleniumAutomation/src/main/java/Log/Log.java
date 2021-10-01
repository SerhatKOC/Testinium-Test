package Log;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log
{
    static Logger logger = Logger.getLogger(Log.class);

    public Log()
    {
        DOMConfigurator.configure("log4j.xml");
    }

    public static void info(String message) {  logger.info(message);   }
    public static void warm(String message) {  logger.warn(message);   }
    public static void error(String message) { logger.error(message);  }
    public static void fatal(String message) { logger.fatal(message);  }

}