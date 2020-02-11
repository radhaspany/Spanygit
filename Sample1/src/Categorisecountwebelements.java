import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Categorisecountwebelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\spany\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcAsfr46tw6rZakgsm1NaVpvl3eAln0fydTaHrH5kMscO1nMOaIAMjEZq1oxLaibEkjc0TIwN35m-a3f-9_S_CoxHpqZ4sVDDR2jqbLHK9k0w&smuh=59670&lh=Ac94cvVUDky5gS4W");
		List<WebElement> Radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(Radiobutton.size());
		List<WebElement>	Dropdown = driver.findElements(By.tagName("select"));
		System.out.println(Dropdown.size());
		
		

	}

}
