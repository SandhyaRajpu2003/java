Interface java



//Write a java program to demonstrate Interface

package assignment;
import java.util.Scanner;
interface A{
	void read();
}
class B implements A{
	Scanner s1 = new Scanner(System.in);
	int a,b;
	public void read() {
	   System.out.print("Enter value of a :-");
	   a = s1.nextInt();
	   System.out.print("Enter value of b :-");
	   b = s1.nextInt();
	}
	   void show() {
	   System.out.println("value of a is :-"+a);
	   System.out.println("value of b is :-"+b);
	}
}
public class interface_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          B b1 = new B();
          b1.read();
          b1.show();
	}

}
