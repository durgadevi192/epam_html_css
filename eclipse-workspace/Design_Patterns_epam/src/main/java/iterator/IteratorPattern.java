package iterator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pattern.FacadePattern;
public class IteratorPattern {
	  
	    public static void main(String[] args) {  
	    	final Logger logger=LogManager.getLogger(IteratorPattern.class);
	          CollectionofNames cmpnyRepository = new CollectionofNames();  
	          logger.info("------------------------------------------------------------------"); 
	      	logger.info("*******************Iterator Pattern****************"); 
	          for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
	              String name = (String)iter.next();  
	             logger.debug("Name : " + name); 
	             logger.info("------------------------------------------------------------------"); 
	           }      
	    }  
	}

