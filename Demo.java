package demo;


	import java.util.Scanner;
	public class demo {
	    public static void main(String args[])
	    {
	        System.out.println("-------------Rules---------------");
	        System.out.println("1.Enter Strings ALways in Capital Letters.");
	        System.out.println("1.Don't Enter String in Small Letters.");
	        System.out.println("1.Don't Enter Numbers.");
	        System.out.println("--------------------------------------");
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter String= ");
	        String UserInput=sc.nextLine();
	        int lenth=UserInput.length();
	         System.out.print("Code For "+UserInput + " is= ");
	        
	       
	        for(int i=0;i<lenth;i++)
	        {
	            switch(UserInput.charAt(i)){
	                  
	                case 'A':System.out.print(" 1");break;
	                case 'B':System.out.print(" 2");break;
	                case 'C':System.out.print(" 3");break;
	                case 'D':System.out.print(" 4");break;
	                case 'E':System.out.print(" 5");break;
	                case 'F':System.out.print(" 6");break;
	                case 'G':System.out.print(" 7");break;  
	                case 'H':System.out.print(" 8");break;
	                case 'I':System.out.print(" 9");break;
	                case 'J':System.out.print(" 10");break;
	                case 'K':System.out.print(" 11");break;
	                case 'L':System.out.print(" 12");break;
	                case 'M':System.out.print(" 13");break;
	                case 'N':System.out.print(" 14");break;
	                case 'O':System.out.print(" 15");break;
	                case 'P':System.out.print(" 16");break;
	                case 'Q':System.out.print(" 17");break;
	                case 'R':System.out.print(" 18");break;
	                case 'S':System.out.print(" 19");break;
	                case 'T':System.out.print(" 20");break;
	                case 'U':System.out.print(" 21");break;
	                case 'V':System.out.print(" 22");break;
	                case 'W':System.out.print(" 23");break;
	                case 'X':System.out.print(" 24");break;
	                case 'Y':System.out.print(" 25");break;
	                case 'Z':System.out.print(" 26");break;
	                default:System.out.println("Read The above Rules And Try Again!!");break;
	                

	            }
	        }

	        
	    }
	}
Footer
