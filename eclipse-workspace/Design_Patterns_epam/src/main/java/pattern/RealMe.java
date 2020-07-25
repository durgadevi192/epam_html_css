package pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class RealMe implements MobileShop {  
	final Logger logger=LogManager.getLogger(RealMe.class);
    public void modelNo() {  
    logger.info(" Blackberry Z10 ");  
    }      public void price() {  
        logger.info(" Rs 55000.00 ");  
    }  
}  