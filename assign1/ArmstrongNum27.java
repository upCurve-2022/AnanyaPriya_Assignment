package assign1;

import java.util.Scanner;

public class ArmstrongNum27 {
    public static void main(String []args){
        System.out.println("Enter 3 digit number");
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        while(a>0){
            int rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if(sum==b)
            System.out.println("Number is armstrong number");
        else
            System.out.println("Number is not armstrong");
    }
}
