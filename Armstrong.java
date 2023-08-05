import java.util.Scanner;
class demo
{
int no , originalNumber, remainder, result = 0;;
Scanner S=new Scanner(System.in);
}
class demo1 extends demo
{
	void read()
	{
		System.out.println("Enter number");
		no=S.nextInt();
	}
	void show()
	{
        originalNumber = no;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == no)
            System.out.println(no + " is an Armstrong number.");
        else
            System.out.println(no + " is not an Armstrong number.");
    }
}
public class Armstrong
{

    public static void main(String[] args) {
 demo1 obj=new demo1();
 obj.read();
 obj.show();
    }
}
