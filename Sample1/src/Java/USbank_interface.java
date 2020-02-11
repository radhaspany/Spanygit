package Java;

public interface USbank_interface
{
int Minbalance=100;

public void Credit();
public void Debit();
public void Transfer();
//Refer note line 15-public static void Radha();

//Interface will have only method declaration/method calling and no body(Method definition).
//In interface we can declare the variable and variables are "static" by default in nature.
//Variable value will not change.It is final in nature.
//No static method in interface.
//We cannot create object of interface.

}
