import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollnew {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver f=new ChromeDriver();
		 f.get("https://www.amazon.com/");
		 f.manage().window().maximize();
		 Thread.sleep(5000);
		//scrolldown(X,Y)
		 ((JavascriptExecutor)f).executeScript("scroll(0,2000)");
	     Thread.sleep(5000);
	     //Scrollup(X,Y)
	     ((JavascriptExecutor)f).executeScript("scroll(0,-1000)");
	}

}
