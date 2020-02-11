package Java;

public class HSBCbank_interface implements USbank_interface,Brazilbank_interface
{
//Note:If a class is implementing any interface,then its mandatory to define/override all the methods of interface.
//note: We are achieving multiple inheritance here.
	public void Credit()
	{
		System.out.println("USbank Credit");
	}
	public void Debit()
	{
		System.out.println("USbank Debit");
	}
	public void Transfer()
	{
		System.out.println("HSBC Transfer");
	}
	public void EducationLoan()
	{
		System.out.println("HSBC EdLoan");
	}
	public void Carloan()
	{
		System.out.println("HSBC Carloan");
	}
	public void Mutualfund()
	{
		System.out.println("HSBC Mutualfund");
	}
}
