package assign1;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String []args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long reverse=0;
        long b=a;
        while(a>0){
            long rem=a%10;
            reverse=rem+(reverse*10);
            a=a/10;
        }
        while(b%10==0){
            System.out.print("0");
            b=b/10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
