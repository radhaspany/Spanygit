import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\prudh\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/login.php");

	}

}
