import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(1000);
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']//span[text()='testing']"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("the total number of suggestions in searchbox-----" + list.size());
		for(int i=0; i<=list.size()-1; i++)
		{
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().contains("testing"))
		{
		list.get(i).click();
		break;
		}
		}
	}

}
