package proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ProxyInternetAccess implements InternetAccess {  
	final Logger logger=LogManager.getLogger(ProxyInternetAccess.class);
    private String employeeName;  
    RealInternetAccess  realaccess;  
        public ProxyInternetAccess(String employeeName) {  
     this.employeeName = employeeName;  
 }  
 public void grantInternetAccess()   
 {   
     if (getRole(employeeName) > 4)   
     {  
         realaccess = new RealInternetAccess(employeeName);  
         realaccess.grantInternetAccess();  
     }   
     else   
     {  
         logger.info("No Internet access granted. Your job level is below 5");  
     }  
 }  
 public int getRole(String emplName) { 
     return 9;  
 }  
}