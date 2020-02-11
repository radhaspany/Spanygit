package Java;

public class Singleinheritance_Mainclass {

	public static void main(String[] args) 
	{
		//Singleinheritance_class1 Obj1=new Singleinheritance_class1();
		Singleinheritance_class2 Obj2=new Singleinheritance_class2();
		
		Obj2.getdata(4, 5);
		int Add=Obj2.Add();
		System.out.println(Add);
		int M=Obj2.Multiplication();
		System.out.println(M);

	}

}
