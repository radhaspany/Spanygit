package Com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com"); 
	}
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{ 
		String title= driver.getTitle();
	System.out.println(title);
	//Assert.assertEquals(title, "Google123", "title is not matched"); 	
	} 
	@AfterMethod 
	public void tearDown()
	{
		driver.quit();
	} 
	
	

}
