package assign1;

import java.util.Scanner;

public class ReverseString25 {
    public static void main(String []args){
        System.out.println("Enter the string");
        String a,b="";
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        int i=0;
        while(i<a.length()){
            b=a.charAt(i)+b;
            i++;
        }
        System.out.println(b);
    }
}
