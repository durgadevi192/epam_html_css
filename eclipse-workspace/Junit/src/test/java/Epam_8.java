import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author A.V.V.Satyanarayana
 *
 */
public class Epam_8 {
		String remove(String string)
		{
			String string_after_removig_a = "";
			int length=string.length();
			if(length==0)
			{
				return "";
			}
			else if((length==1 && string.equals("A")) || (length==2 && string.equals("AA")))
			{
				return "";
			}
			else 
			{
				if(string.charAt(0)=='A' && string.charAt(1)=='A')
				{
					string_after_removig_a=string.substring(2,length);
				}
				else if(string.charAt(0)=='A' && string.charAt(1)!='A')
				{
					string_after_removig_a=string.substring(1,length);
				}
				else if(string.charAt(0)!='A' && string.charAt(1)=='A')
				{
					string_after_removig_a=string.charAt(0)+string.substring(2,length);
				}
				else
				{
					return string;
				}
			}
			return string_after_removig_a;
		}
	}
