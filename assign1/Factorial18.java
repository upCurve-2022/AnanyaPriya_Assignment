package assign1;

import java.util.Scanner;

public class Factorial18 {
    public static void main(String []args){
        int n,product=1;
        System.out.println("Enter N");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            product=product*i;
        }
        System.out.println("Factorial of "+n+" is "+product);
    }
}
