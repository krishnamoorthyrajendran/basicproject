package day;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class day1 {
	
	public static Logger log=LogManager.getLogger(day1.class.getName());
	@Test
	public void zstart() {
		log.debug("debug");
		log.info("info");
		log.error("debug");
		log.warn("info");
		log.fatal("fatal");
		
		
	}

}
