package javachallenges;
//Write a java program to check if input year is leap year or not.
import java.util.Scanner;
public class leapyear6 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if(year%400==0)
            System.out.println("Year is leap year");
        else if(year%100==0)
            System.out.println("Year is not leap year");
        else if(year%4==0)
            System.out.println("Year is leap year");
        else
            System.out.println("Year is not leap year");
    }
}
