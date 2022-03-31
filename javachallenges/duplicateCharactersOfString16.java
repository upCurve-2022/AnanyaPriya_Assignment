package javachallenges;
//Write a java program to print the duplicate characters of the string.
import java.util.Scanner;

public class duplicateCharactersOfString16 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        char b[]=new char[60];
//        System.out.println(b[5]);
        char k;
        int l;
//        System.out.println('a'-'A');
        for(int i=0;i<a.length();i++){

            char ch=a.charAt(i);
            if(ch==' ')
                continue;
            int t=ch-'A';
            System.out.println(t);
            b[t]++;

        }
        for(int i=0;i<=57;i++){
            if(b[i]>1){
                l=i+65;
               k=(char)l;
                System.out.print(k);
            }
        }
    }
}
