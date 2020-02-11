import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver f=new ChromeDriver();
		 f.get("https://www.flipkart.com/viewcart");
		 Thread.sleep(4000);
		 f.findElement(By.xpath("//div[text()='My Cart']")).getText();
		 f.findElement(By.xpath("//a[text()='Login & Signup']")).getText();
		 f.findElement(By.xpath("//div[text()='Missing Cart items?']")).getText();
		 f.findElement(By.xpath("//div[text()='Login to see the items you added previously']")).getText();
		 f.findElement(By.xpath("//a[text()='Returns Policy']")).getText();
		 f.findElement(By.xpath("//span[@class='_3Nusnj']")).getText();
		 //how do i validate entire sentence -Need help? Visit the Help Center or Contact Us
		 //finding search icon
		 f.findElement(By.xpath("//a[text()='Help Center']")).getText();
		 f.findElement(By.xpath("//a[text()='Terms of use']")).getText();
		 f.findElement(By.xpath("//input[@name='q']")).sendKeys("shampoo");
		
		 
	}

}
