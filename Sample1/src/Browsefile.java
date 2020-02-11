import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsefile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(10000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		//driver.findElement(By.name("fileupload")).click();
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\prudh\\Desktop\\check.docx");
	
	}

}
