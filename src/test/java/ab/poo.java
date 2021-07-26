package ab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class poo {
	
	private static Logger Log = LogManager.getLogger(poo.class.getName());
	

  public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.debug("i am debuging");
		Log.info("Obj is present");
		Log.error("obj is not present");
		Log.fatal("this is fatal");
		
	
	}

}
