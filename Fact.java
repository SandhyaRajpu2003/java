package assignment;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, fact=1;
		
		System.out.print("Enter the Number :-");
		
		Scanner sc = new Scanner (System.in);
		
		n=sc.nextInt();
		
		for(i=1; i<=n; i++) 
		
		{
			fact=fact*i;
			System.out.println(fact);
		}

	}
}
