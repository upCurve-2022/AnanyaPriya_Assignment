package javachallenges;

import java.util.Scanner;
//Write a java program to check if given number is a perfect square.
public class perfectsquare5 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int d=sc.nextInt();
        double a=Math.sqrt(d);
        int e=(int)a;
        if(d==e*e)
            System.out.println("number is perfect square");
        else
            System.out.println("number is not perfect square");

    }
}
