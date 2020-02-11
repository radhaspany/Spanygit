import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageobjmodel_loginclass 
{
 WebDriver driver;
 By Username=By.name("email");
 By Password=By.name("pass");	
 By Login	=By.xpath("//input[@type='submit']");
//constructor - class name is same as method name
//no parameters passed - 
public Pageobjmodel_loginclass(WebDriver driver)
{
	this.driver=driver;
}
public void username()
{
	driver.findElement(Username).sendKeys("radha.spandu@gmail.com");
}
public void password()
{
	driver.findElement(Password).sendKeys("Spany9191");
}
public void login()
{
	driver.findElement(Login).click();
}
}
