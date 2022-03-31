package javachallenges;

import java.util.Scanner;

//Write a java program to read two string user input and check if first contains the second.
public class firstContainsSecond {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String a=sc.nextLine();
        System.out.println("Enter 2nd string");
        String b=sc.nextLine();
        int j=0,flag,i;
        for(i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(j)){
//                flag=0;
                j=0;
            }
            else if(a.charAt(i)==b.charAt(j)){
//                flag=1;
                j++;
                if(j==b.length())
                    break;
            }

        }
        if(j==b.length())
            System.out.println("First string contains second string");
        else
            System.out.println("First string doesnot contains second string");

    }
}
