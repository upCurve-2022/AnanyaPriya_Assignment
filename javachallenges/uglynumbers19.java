package javachallenges;

import java.util.Scanner;

//Write a java program to check whether given number is an ugly number.
//        Note: In number system, ugly numbers are positive numbers whose only prime factors are
//        2,3,5.
public class uglynumbers19 {
    public static int primeno(int n){
        int i;
        if(n==2)
            return 1;
        for(i=2;i<=(Math.sqrt(n));i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int i=sc.nextInt();
        if(i==1)
            System.out.println("ugly number");
        int j;
        for(j=2;j<=i;j++){
            if(i%j==0&&primeno(j)==1){
                if(j!=2&&j!=3&&j!=5) {
                    System.out.println("not a ugly number");
                    break;
                }

                }
            }
        if(j>i&&i!=1)
        System.out.println("ugly number");
    }
}
