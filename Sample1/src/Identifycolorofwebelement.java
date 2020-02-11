import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identifycolorofwebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj40qHnhovmAhUHSq0KHQHZCBYQPAgH");
		//String button_color=driver.findElement(By.className("sign-in-form__submit-btn")).getCssValue("background-color");
        //System.out.println(button_color);
        //String Text_color=driver.findElement(By.className("sign-in-form__submit-btn")).getCssValue("color");
        //System.out.println(Text_color);
		String Signin_color=driver.findElement(By.id("gb_70")).getCssValue("background-color");
		System.out.println(Signin_color);
		String Signintext_color=driver.findElement(By.id("gb_70")).getCssValue("color");
		System.out.println(Signintext_color);
	
	}

}
