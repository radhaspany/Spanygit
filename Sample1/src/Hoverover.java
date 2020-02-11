import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver f=new ChromeDriver();
		 f.get("https://www.spicejet.com/");
		 Actions action=new Actions(f);
		 action.moveToElement(f.findElement(By.id("highlight-addons"))).build().perform();

		 
		
	}

}
