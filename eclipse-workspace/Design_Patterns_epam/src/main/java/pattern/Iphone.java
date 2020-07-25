package pattern;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
public class Iphone implements MobileShop {  
	final Logger logger=LogManager.getLogger(Iphone.class);
    public void modelNo() {  
        logger.info(" Iphone 6 ");  
    }  
    public void price() {  
    logger.info(" Rs 65000.00 ");  
    }  
}