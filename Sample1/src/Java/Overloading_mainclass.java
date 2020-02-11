package Java;

public class Overloading_mainclass {

	public static void main(String[] args) {
		Methodoverloading_diffdatatype Obj1=new Methodoverloading_diffdatatype();
		Methodoverloading_seqofdatatype Obj2=new Methodoverloading_seqofdatatype();
		Methodoverloading_numberofargument Obj3=new Methodoverloading_numberofargument();
		
		Obj1.display(5);
		Obj1.display("spandana");
		Obj2.Differentdatatype('S', 7);
		Obj2.Differentdatatype(8,'R');
		Obj3.Numberofargument(5);
		Obj3.Numberofargument(2, 3);
		

	}

}
