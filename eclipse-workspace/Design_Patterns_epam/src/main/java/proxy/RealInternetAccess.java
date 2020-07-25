package proxy;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
public class RealInternetAccess implements InternetAccess {  
	final Logger logger=LogManager.getLogger(RealInternetAccess.class);
    private String employeeName;  
    public RealInternetAccess(String empName) {  
        this.employeeName = empName;  
    }  
    public void grantInternetAccess() {  
        logger.info("Internet Access granted for employee: "+ employeeName); 
        logger.info("------------------------------------------------------------------------");
        logger.info("");
    }  
}