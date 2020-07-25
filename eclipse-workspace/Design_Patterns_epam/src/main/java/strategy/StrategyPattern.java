package strategy;

import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import proxy.ProxyPatternClient;
public class StrategyPattern {  
      
    public static void main(String[] args) throws IOException {  
    	final  Logger logger=LogManager.getLogger(ProxyPatternClient.class);
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          logger.info("-----------------------------------------------------------");
          logger.info("********************Strategy Pattern********************");
          logger.info("Enter the first value: ");  
          float value1=Float.parseFloat(br.readLine());  
          logger.debug("The First Number is: "+value1);
          logger.info("Enter the second value: ");  
          float value2=Float.parseFloat(br.readLine());  
          logger.debug("The First Number is: "+value1);
          Context context = new Context(new Addition());          
          logger.debug("Addition = " + context.executeStrategy(value1, value2));  
          context = new Context(new Subtraction());       
          logger.debug("Subtraction = " + context.executeStrategy(value1, value2));  
          logger.info("----------------------------------------------------------");
          logger.info("");
       }  
}