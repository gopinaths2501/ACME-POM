package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import SeleniumBase.SeleniumBase;

public class ACMEPage extends SeleniumBase{
   
	
	public ACMEPage RunACMEUserName (String UserName) throws InterruptedException {
 
	     WebElement uName = driver.findElementById("email");
	     
	     uName.sendKeys(UserName);
	     
	     uName.sendKeys(Keys.TAB);
	     
	     Thread.sleep(1000);
	     
	     return this;
	     
	}
	
	public ACMEPage RunACMEUserPassword (String Password) throws InterruptedException {
	     
         driver.findElementById("password").sendKeys(Password);
	     
         driver.findElementById("buttonLogin").click();
         
         String ActualTitle  = driver.getTitle();
         
         String ExpectedTitle= "ACME System 1 - Account - Log In";
         
         if (ExpectedTitle.equals(ActualTitle)) {
        	 
        	 System.out.println("Title Verified");
			
		}
         
         else 
        	 
         {
        	 System.out.println("Title is NOT Verified");
         }
       
         
         System.out.println(ActualTitle);
         
         return new ACMEPage();
         
        
 		
 		
        
 		
	    }
	     
	     

	}


