package assign1;

import java.util.Scanner;

public class Swap2_numbers {

    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1.swap two numbers \n 2.swap three numbers \n 3.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int temp;
                    temp = a;
                    a = b;
                    b = temp;
                    System.out.println("a=" + a + " b=" + b);
                    break;
                case 2:
                    System.out.println("Enter three number");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int c = sc.nextInt();
                    temp = a;
                    a = b;
                    b = c;
                    c = temp;
                    System.out.println("a=" + a + " b=" + b + " c=" + c);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");

            }
        }
    }
}
