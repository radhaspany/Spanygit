package Java;

public class Wraperclass {

	
	public static void main(String[] args)
	{
	// Sting1
		String A="100";
	System.out.println(A+20);
	
	//Note:"Integer.parseInt"convert string in to interger
	int I=Integer.parseInt(A);
	System.out.println(I+20);
	
	
	// String to Double conversion ; double is used as its a decimal number.
	String Y="10.55";
	double X=Double.parseDouble(Y);
	System.out.println(X+10);
	
	//String to char
	//We cannot convert string to character.No method is available
	String K="Spandana";
	//char A =Character.
	
	//Conversion of string to boolean.
	String B="Radha";
	boolean C=Boolean.parseBoolean(B);
	System.out.println(C);
			
	//Conversion of int to String
	int J=100;
	String S=String.valueOf(J);
	System.out.println(J);
	}

}
