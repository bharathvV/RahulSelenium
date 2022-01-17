package beta;

import org.apache.logging.log4j.*;

public class Demo1 {
	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
//		System.out.println(Demo.class.getName());
		log.debug("i am debugging");
		if(true) {
			log.info("i am infowing some text here");
			log.error("Object does not exists");
			log.fatal("this is fatal error");
		}
	
       
	}

}
