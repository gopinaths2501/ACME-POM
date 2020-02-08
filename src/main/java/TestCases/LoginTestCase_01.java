package TestCases;

import org.testng.annotations.Test;

import Pages.ACMEPage;
import SeleniumBase.SeleniumBase;

public class LoginTestCase_01 extends SeleniumBase{
    
	@Test(dataProvider="sendData")

	
	public static void RunACMETest(String UName, String Pword) throws InterruptedException
	
	{
		ACMEPage Obj = new ACMEPage();
		
		Obj.RunACMEUserName(UName);
		
		Obj.RunACMEUserPassword(Pword);
		
		
	}
 		
 		
 		
        
 		
	    }
	     
	     
