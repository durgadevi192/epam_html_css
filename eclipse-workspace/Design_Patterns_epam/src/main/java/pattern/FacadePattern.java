package pattern;

import java.io.*;  

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class FacadePattern {  
     static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
    	final Logger logger=LogManager.getLogger(FacadePattern.class);
    	logger.info("------------------------------------------------------------------"); 
    	logger.info("*******************Facade Pattern****************"); 
            logger.info("Phones Available Are:");  
            logger.info("1. IPHONE.");  
            logger.info("2. OOPO");  
            logger.info("3. REALME.");  
            logger.info("Enter your choice: ");  
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();  
              
       switch (choice) {  
       case 1: sk.iphoneSale();  
                break;  
       case 2: sk.oopoSale();         
                break;    
       case 3: sk.realmeSale();         
                break;     
       default:	logger.info("Nothing You purchased");         
                return;  
            }  
       logger.info("--------------------------------------------------------"); 
   }  
}  