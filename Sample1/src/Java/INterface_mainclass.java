package Java;

public class INterface_mainclass {

	public static void main(String[] args) {
		HSBCbank_interface Obj1=new HSBCbank_interface();
		Obj1.Credit();
		Obj1.Debit();
		Obj1.Mutualfund();
		Obj1.Carloan();
		Obj1.EducationLoan();
		System.out.println(USbank_interface.Minbalance);
		//cannot be changed-USbank_interface.Minbalance=200;
		//cannot create obj for interface-USbank_interface Obj2=new USbank_interface();
	}

}
