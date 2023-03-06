package log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class MyTimerLoggings {
	
	 static Logger logger=Logger.getLogger(MyTimerLoggings.class);

	    public MyTimerLoggings(){
	        DOMConfigurator.configure("log4j.xml");
	    }

	    public void info(String message){
	        logger.info(message);
	    }

	    public void warn(String message){
	        logger.warn(message);
	    }
	    public void error(String message){
	        logger.error(message);
	    }
	    public void fatal(String message){
	        logger.fatal(message);
	    }
	    
	    

}
