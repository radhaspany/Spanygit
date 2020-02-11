package Java;

public class Javaclass1 {

	public static void main(String[] args) {
		Javaclass1 obj=new Javaclass1();
		obj.Test();
		
		Javaclass2 Obj2=new Javaclass2();
		Obj2.Number();
		
		
	}
//Method definition
	public void Test()
{
	//scope of I is only in this Test method.
		int I=1;
	System.out.println(I);
}

}
