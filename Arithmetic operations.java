

package vaishali_135;

import java.util.Scanner;

class demo{
	int a,b,sum,sub,mul,div;
	Scanner s1 = new Scanner(System.in);
	void get() {
		System.out.print("Enter First Number :-");
		a = s1.nextInt();
		System.out.print("Enter Second Number :-");
		b = s1.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	void add() {
		sum = a+b;
		System.out.println("Addition of "+a+" and "+b+" is :- "+sum);
		
		
	}
	
	void sub() {
		sub = a-b;
		System.out.println("Substraction of "+a+" and "+b+" is :- "+sub);
		
	}
	void mul() {
	mul = a*b;
	System.out.println("Multipliction of "+a+" and "+b+" is :- "+mul);
	}
	void div() {
		div = a/b;
		System.out.println("Division of "+a+" and "+b+" is :- "+div);
		
	}
}

public class arithmetic_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          demo d1 = new demo();
          d1.get();
          d1.add();
          d1.sub();
          d1.mul();
          d1.div();
	}

}
