package factorymethod;
import factorymethod.Above_Standard;

public class Get_Plan {
	public Cost plantype(String plan_type){  
        
        if(plan_type.equalsIgnoreCase("Standard")) {  
            return new Standard();
        }
            else if(plan_type.equalsIgnoreCase("Above Standard")) {  
             return new Above_Standard();  
           }   
       else if(plan_type.equalsIgnoreCase("High Standard")){  
            return new High_Standard();  
        }   
      else if(plan_type.equalsIgnoreCase("High Standard and Automated")) {  
            return new Automated_HighStandard();  
      }  
  return null;  
}  

}
