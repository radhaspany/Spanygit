package Com.TestNG;

import org.testng.annotations.Test;

public class Dependsonmethodconcept {
	
	@Test
	public void Logintest()
	{
		int i=10/0;
		System.out.println("Login-test");
	}
	@Test(dependsOnMethods="Logintest")
	public void Homepage()
	{
		System.out.println("Validate Home page");
	}
	@Test(dependsOnMethods="Homepage")
	public void Search()
	{
		System.out.println("Search My ID");
	}
	@Test
	public void Logout()
	{
		System.out.println("Logged out");
	}
}
