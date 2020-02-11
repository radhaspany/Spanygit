package Java;

public class Finalvariable {

	final int Speedlimit=90;
	//This is final variable.
	
	public void run()
	{
	//Speedlimit=400;	
	//warning is displayed that final variable value cannot be changed.
	}
	
	public static void main(String[] args) {
		Finalvariable Obj1=new Finalvariable();
		Obj1.run();

	}

}
