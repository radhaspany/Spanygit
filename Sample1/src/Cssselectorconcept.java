import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectorconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//By using Type-ID
	//	driver.findElement(By.cssSelector("#email")).sendKeys("abcd@gmail.com");
//By using Type-class	
	//	driver.findElement(By.cssSelector(".inputtext login_form_input_box")).sendKeys("Testpassword");
//By using Type-Attribute
	//  driver.findElement(By.cssSelector("input[name=email]")).sendKeys("check ID");
//By using multiple attributes
	//	driver.findElement(By.cssSelector("input[name=email][id=email]")).sendKeys("Test Email");
//By using Sub-String(by using*)
	//	driver.findElement(By.cssSelector("input[id*=m]")).sendKeys("Hello");
//By using Andwith($)- Give last letter of the word
	//	driver.findElement(By.cssSelector("input[id$=l]")).sendKeys("Hello");
//By using Startwith^- Give first letter of the word
		driver.findElement(By.cssSelector("input[id^=e]")).sendKeys("Hello");
	
	}

}
	