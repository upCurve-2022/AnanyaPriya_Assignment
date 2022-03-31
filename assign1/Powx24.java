package assign1;

import java.util.Scanner;

public class Powx24 {
    public static void main(String []args){
        System.out.println("Enter X and N");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*x;
        }
        System.out.println(product);
    }
}
