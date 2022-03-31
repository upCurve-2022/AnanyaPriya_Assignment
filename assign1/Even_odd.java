package assign1;

import java.util.Scanner;

public class Even_odd {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("Number is even");
        }
        else
            System.out.println("Number is odd");
    }
}
