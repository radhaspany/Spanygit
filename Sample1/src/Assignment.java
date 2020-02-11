import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment {

	WebDriver driver;
	
	@BeforeMethod
	
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void Validlogin()
	{
		driver.get("https://www.facebook.com/");
		Pageobjmodel_loginclass Obj=new Pageobjmodel_loginclass(driver);
		Obj.username();
		Obj.password();
		Obj.login();
		
		
	}
}
