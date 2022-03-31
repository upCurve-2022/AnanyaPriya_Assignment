package assign1;

import java.util.Scanner;

public class SeparateWholeFraction {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        String number = String.valueOf(a);
        String arr[] = number.split("\\.");

        String fraction = arr[1];
        String whole = arr[0];
        System.out.println(whole);
        System.out.println(fraction);

    }
}
