package javachallenges;
//Write a java program to count the number words in a string.
import java.util.Scanner;

public class noOfWords13 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter a string");
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ')
                count++;
        }
        count++;
        System.out.println("no of words is "+count);
        sc.close();
    }
}
