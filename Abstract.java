//Java program to demonstrate abstract class. 

abstract class A
{
 int a,b;
 void get()
 {
	 a=10;
	 b=20;
	 
 }

abstract public  void put();
}
class demo extends A
{
	public void put()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("Multiplication is="+ a*b);
	}
}

public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    demo d=new demo();
    d.get();
    d.put();
	}
}
