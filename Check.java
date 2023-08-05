//Java code check spaces, number, characters & others.
import java.util.Scanner;
class countwnum{
    void count(String x){
        char[] ch=x.toCharArray();
        int letter = 0;
        int space=0;
        int num = 0;
        int otherchat = 0;
        for(int i=0;i<x.length();i++){
            if(Character.isLetter(ch[i]))
            {
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                otherchat++;
            }
        }
        System.out.println("Letter is :-"+letter);
        System.out.println("Space is :-"+space);
        System.out.println("Number is :-"+num);
        System.out.println("Other is :-"+otherchat);
    }
}
class countword {
    public static void main(String[] args) {
        countwnum c = new countwnum();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String :-");
        String test = sc.nextLine();
        System.out.println("String is :-"+test);
        c.count(test);
        }
}
