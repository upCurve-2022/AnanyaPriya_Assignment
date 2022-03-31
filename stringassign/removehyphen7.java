package stringassign;

import java.util.Scanner;

public class removehyphen7 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        String b="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='-'&&Character.isDigit(a.charAt(i-1))&&Character.isDigit(a.charAt(i+1)))
                continue;
            b=b+a.charAt(i);
        }
        System.out.println(b);
    }
}
