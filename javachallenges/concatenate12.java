package javachallenges;
import java.util.Scanner;
//Write a java program to concatenate two strings.
public class concatenate12 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String a=sc.nextLine();
        System.out.println("Enter 2nd string");
        String b=sc.nextLine();
        String c;
        c=a;
        char d;
//        System.out.println(c);
        for(int i=0;i<b.length();i++) {
            d=b.charAt(i);
            c = c + d;
        }
        System.out.println(c);
    }
}
