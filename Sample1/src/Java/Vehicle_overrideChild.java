package Java;

public class Vehicle_overrideChild extends Vehicle_overrideParent
{
void Run()
{
	int I=5;
	System.out.println(I);
	System.out.println("This is child class");
}
	public static void main(String[] args) 
	{
		Vehicle_overrideChild Obj=new Vehicle_overrideChild();
		Obj.Run();
		

	}

}
