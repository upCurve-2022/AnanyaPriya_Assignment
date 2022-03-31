package assign1;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String args[]){
        System.out.println("Enter principle,rate and time");
        Scanner sc=new Scanner(System.in);
        int principle=sc.nextInt();
        float rate=sc.nextFloat();
        int time=sc.nextInt();
        float amount=((principle*rate*time)/100);
        System.out.println("The amount is"+amount);
        sc.close();
    }
}
