package assign1;

import java.util.Scanner;

public class Display_no_in_words {
    enum Number{ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE}
    public static void main(String []args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Number n[]=Number.values();
        int i;
        String s;
//        while(a>0){
//            int rem=a%10;
//            if(rem==0)
//                s="ZERO";
//            if(rem==1)
//                s="ONE";
//            if(rem==2)
//                s="TWO";
//            if(rem==3)
//                s="THREE";
//            if(rem==4)
//                s="FOUR";
//            if(rem==5)
//                s="FIVE";
//            if(rem==6)
//                s="SIX";
//            if(rem==7)
//                s="SEVEN";
//            if(rem==8)
//                s="EIGHT";
//            if(rem==9)
//                s="NINE";
//
//        }
        int b=a;
        int reverse=0;
        while(a>0){
            int rem=a%10;
            reverse=rem+(reverse*10);
            a=a/10;
        }
        while(reverse>0){

            int rem=reverse%10;
            s=" "+n[rem].toString();
            System.out.print(s);
            reverse=reverse/10;
        }
        while(b%10==0){
            System.out.print(" ZERO");
            b=b/10;
        }
    }
}
