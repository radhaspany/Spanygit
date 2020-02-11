import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver D=new ChromeDriver();
		D.get("https://www.facebook.com/");
		D.manage().window().maximize();
		//Thread.sleep(5000);
		//Cntl+F>search Xpath till 1out of 1 result
		D.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("Test@facebook.com");
		D.findElement(By.xpath("//input[@type='password' and @id='pass']")).sendKeys("Test");
		D.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("SreeRam Prudhvi");
		D.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("Mattey");
		D.findElement(By.xpath("//input[@type='text' and @id='u_0_k']")).sendKeys("12345678");
		D.findElement(By.xpath("//input[@type='password' and @id='u_0_p']")).sendKeys("ABCD");
		D.findElement(By.xpath("//label[text()='Female']")).click();
		//D.findElement(By.linkText("Create a Page")).click();
		//copied xpath from console>Rightclick>copy>copyXpath
		D.findElement(By.xpath("//*[@id=\"birthday-help\"]/i")).click();
	
	}

}
