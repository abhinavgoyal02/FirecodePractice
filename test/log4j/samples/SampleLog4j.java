package log4j.samples;

import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class SampleLog4j {

	public static Logger restAPILogger = LogManager.getLogger(SampleLog4j.class.getName());
	
  @Test
  public void one() {
	  restAPILogger.debug("Test One");
  }
  
  @Test
  public void two() {
	  restAPILogger.info("Test Two");
  }
  
  @Test
  public void three() {
	  restAPILogger.error("Test Three");
	  restAPILogger.fatal("Fatal Error");
  }
  
  @Test
  public void four() {
	  restAPILogger.warn("Test Four");
  }
  
  
}
