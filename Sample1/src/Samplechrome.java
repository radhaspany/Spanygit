import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplechrome {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver_win32\\chromedriver.exe");
   
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.google.com/?gws_rd=ssl");
 //name="q"
driver.manage().window().maximize();;
Thread.sleep(5000);
 driver.findElement(By.name("q")).sendKeys("spandana"); 
 //driver.findElement(By.name("btnK")).click();
 //driver.findElement(By.linkText("Gmail")).click();
//Images#	
    /*driver.findElement(By.linkText("Images")).click();
	Thread.sleep(6000);
	if(driver.findElement(By.className("S3Wjs")).isDisplayed()) 
	{
		System.out.println("Images Page is loaded");
	}
	else
	{
		System.out.println("Images page is not loaded");
	}*/
	
//GoogleApps# - not working
   //driver.findElement(By.xpath("//a[@title='Google apps']")).click();
  /* if(driver.findElement(By.className("LVal7b")).isDisplayed())
   {
    System.out.println("GoogleApps are displayed");
   }
   else
   {
	System.out.println("GoogleApps are not displayed");
	}*/
//Signin#
   /*driver.findElement(By.id("gb_70")).click();
   Thread.sleep(5000);*/
//About#
  // driver.findElement(By.linkText("About")).click();
//Store#	
	//driver.findElement(By.linkText("Store")).click();
//Advertising#	
	//driver.findElement(By.linkText("Advertising")).click();
//Business#
    // driver.findElement(By.linkText("Business")).click();
//How Search works# 
     //driver.findElement(By.linkText("How Search works")).click();
//GoogleSearch#- not working  
driver.findElement(By.name("btnK")).click();
//Get Nest Wifi now on the Google Store#
//driver.findElement(By.linkText("Get Nest Wifi now on the Google Store")).click();
//Privacy#
//driver.findElement(By.linkText("Privacy")).click();
//Terms#
//driver.findElement(By.linkText("Terms")).click();
//Settings#	
/*	driver.findElement(By.linkText("Settings")).click();
	Thread.sleep(5000);
	if(driver.findElement(By.linkText("History")).isDisplayed())
	{
		System.out.println("Settings popup is displayed");
	}
	else
	{
		System.out.println("Settings popup is not displayed");
	}*/
	}
	
}