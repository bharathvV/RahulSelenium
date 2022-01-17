package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
//		System.out.println(Demo.class.getName());
		log.debug("i have clicked on button");
		if(true) {
			log.info("button is displayed");
			log.error("button is not displayed");
			log.fatal("buttton is missings");
		}
	}

}
