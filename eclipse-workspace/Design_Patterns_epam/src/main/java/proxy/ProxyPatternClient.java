package proxy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProxyPatternClient {  
    public static void main(String[] args)   
    {  
    	final  Logger logger=LogManager.getLogger(ProxyPatternClient.class);
    	logger.info("------------------------------------------------------------------------");
    	logger.info(" **************************Proxy Pattern***********************");
        InternetAccess access = new ProxyInternetAccess("Allu Durga Devi");  
        access.grantInternetAccess();  
    }  
}