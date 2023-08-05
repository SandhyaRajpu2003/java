//Java program to check given number is even or odd, prime or not and display its factorial.
import java.util.Scanner;
class demo{
    int num;
    Scanner s1 = new Scanner(System.in);
    void read(){
    System.out.print("Enter number :-");
    num=s1.nextInt();
    }
    void fact(){
        int fact=1;
         for(int i=1;i<=num;i++)
    {
    fact=fact*i;
    	
    }
    System.out.println("Fact is:-"+fact);
	 }
	 void even_odd(){
	     if (num%2==0){
	         System.out.println("Number is even");
	     }
	     else {
	         System.out.println("Number is odd");
	     }
	 }
	 void prime(){
	     int c=0;
	     for(int i=1;i<=num;i++){
	         if(num%i==0){
	             c++;
	         }
	     }
	         if(c==2){
	             System.out.println("Number is prime");
	         }
	         else{
	          System.out.println("Number is not prime");
	         }
    }
}

class checknum {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.read();
        d1.fact();
        d1.even_odd();
        d1.prime();
    }
}
