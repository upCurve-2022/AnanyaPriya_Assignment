package assign1;

import java.util.Scanner;

public class Sumodd_sumeven {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum_odd=0,sum_even=0;
        for(i=1;i<=n;i=i+2)
             sum_odd=sum_odd+i;
        for(i=0;i<=n;i=i+2)
            sum_even=sum_even+i;
        System.out.println("Sum of odd= "+sum_odd+" Sum of even= "+sum_even);
        sc.close();
    }
}
