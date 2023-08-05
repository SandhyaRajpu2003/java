import java.io.*;
class zero
{
 public static void main(String args[])
 {
   int a=5;
   int b=0;
   try
   {
      System.out.println(a/b);
   }
   catch(ArithmeticException e)
   {
	   System.out.println("Divided by zero operational cannot possible");

    }
 }
}

