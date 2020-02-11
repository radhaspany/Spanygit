package Java;

public class Javaclass2 {

	public static void main(String[] args) {
		Javaclass2 Obj=new Javaclass2();
		Obj.Add();
		
		Javaclass1 Obj1=new Javaclass1();
		Obj1.Test();
		Obj.Number();
	}
	public void Add()
	{
		int I=4;
		int G=5;
		int Result=G+I;
		System.out.println(Result);
		
	}
	public void Number()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}

}
}