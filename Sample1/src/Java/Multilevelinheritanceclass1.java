package Java;

public class Multilevelinheritanceclass1 {

	int A;
	int B;
	int result=A+B;
boolean Comparision(int x,int y)
{
	A=x;
	B=y;
if (A>B) 
{
System.out.println("A is greatest");	
}
else
{
System.out.println("B is greatest");
}
return false;
}

int Add()
{
	System.out.println("This is base class");
	return result;
}
}	
