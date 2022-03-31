package javachallenges;

import java.util.Scanner;
//Write a java program to convert the string totally to uppercase.
public class stringToUpper11 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        String b="";
        char d='a';
        System.out.println(a.length());
        for(int i=0;i<a.length();i++){
            int ch=a.charAt(i);
//            System.out.println(ch);
            if(ch<=122&&ch>=97){
                ch=ch-32;
                d=(char)ch;
//                System.out.println(d);
            }
            else
                d=a.charAt(i);
            b=b+d;
        }
        System.out.print(b);


    }
}
