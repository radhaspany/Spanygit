import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserclose {

	public static void main(String[] args) throws InterruptedException {
		//for(int i=1;i<=4;i++)
		//{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver C=new ChromeDriver();
		C.get("https://mail.rediff.com/cgi-bin/login.cgi");
		C.manage().window().maximize();
		//C.quit();
		//System.out.println("Chromebrowser is closed");
		//C.switchTo();
		
		C.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(60000);
		Alert alert=C.switchTo().alert();
	    String text;
		text=alert.getText();
		System.out.println(text);
		alert.accept();
//		To click on cancel- alert.dismiss();
		
		
		
		//}
		}

}
