package assign1;

import java.util.Scanner;

public class BinToDec20 {
    public static void main(String []args){
        long n,rem=0;
        System.out.println("Enter binary number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        int i=0;
        while(n>0){
            if(n%10!=0){
                rem= rem+(long) Math.pow(2,i);
            }
            i++;
            n=n/10;
        }
        System.out.println(rem);
    }
}
