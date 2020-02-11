package Java;

public class StaticandNonstatic {

	//These are global variables.
		static int num=100;
		String name="spandana";
		
	public static void main(String[] args) 
	{
	//No need to create an object for "static" methods.can be called directly.
		
		Add();
	//printing global variable directly
		System.out.println(num);
	//calling "Static" method using class name instead of object.
		StaticandNonstatic.Add();
	//printing variable using class name.	
		System.out.println(StaticandNonstatic.num);
		
	//calling non static method using object.	
		StaticandNonstatic Obj1=new StaticandNonstatic();
		Obj1.Delete();
	//Printing non static global variable using object.	
		System.out.println(Obj1.name);
	}
	
	public static void Add()
	{
	System.out.println("This is add method");
	System.out.println(num);
	}
	
	public void Delete()
	{
		System.out.println("This method is to Delete");
	}
}
