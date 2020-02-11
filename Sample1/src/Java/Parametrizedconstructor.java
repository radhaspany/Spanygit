package Java;

public class Parametrizedconstructor 
{
	int length;
	int width;
public Parametrizedconstructor(int x,int y)
{
	length=x;
	width=y;
	System.out.println("This is parametrized constructor");	
}
public void Area()
{
	System.out.println("The area value is" +(length*width));
}
}
