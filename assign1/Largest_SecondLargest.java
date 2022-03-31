package assign1;

import java.util.Scanner;

public class Largest_SecondLargest {
    public static void main(String args[]){
        System.out.println("Enter three numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest=a;
        int secondlargest=Integer.MIN_VALUE;
        if(b>largest){
            secondlargest=largest;
            largest=b;
        }
        else if(b<largest){
            if(b>secondlargest)
                secondlargest=b;
        }
        if(c>largest){
            secondlargest=largest;
            largest=c;
        }
        else if(c<largest){
            if(c>secondlargest)
                secondlargest=c;
        }
        System.out.println("Largest= "+largest+"SecondLargest= "+secondlargest);
        sc.close();
    }
}
