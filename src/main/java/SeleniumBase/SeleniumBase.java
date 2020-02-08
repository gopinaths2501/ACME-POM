package SeleniumBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utils.LearnReadData;

public class SeleniumBase {
	
	public static ChromeDriver driver;
    
	@BeforeMethod
	
	public static void LaunchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	     driver = new ChromeDriver();
	     
	     driver.get("https://acme-test.uipath.com/account/login");
	     
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     Thread.sleep(1000);
	}
	     
	     @AfterMethod
	     
	     public static void CloseBrowser() throws InterruptedException
	     
	     {
	        
	    	 Thread.sleep(1000);
	    	
	    	driver.close();
 		
	     }
 		
	     
	     @DataProvider
	    	public String[][] sendData() throws IOException {

	    		LearnReadData excel = new LearnReadData();
	    		String[][] data1 = excel.ReadExcel("TestData");
	    		
	    		return data1;

 		
  
	     
	     

	}

}