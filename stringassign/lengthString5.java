package stringassign;

import java.util.Scanner;

public class lengthString5 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        char x[]=a.toCharArray();
        int i=0;
        for(char c:x)
            i++;
        System.out.println("Length is "+i);
    }
}
