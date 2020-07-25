package bridgepattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuestionFormat extends QuestionManager {  
		final Logger logger=LogManager.getLogger(QuestionFormat.class);
	    public QuestionFormat(String catalog){  
	        super(catalog);  
	    }  
	    public void displayAll() {  
	        logger.info("%n---------------------------------------------------------------------------------");  
	        super.displayAll();  
	        logger.info("%n---------------------------------------------------------------------------------");
	        logger.info("*******Bridge Pattern*******");  
	    }  
	}