package assign1;

import java.util.Scanner;

public class Fibonnaci22 {
    public static void main(String []args){
        int a=1,b=1,c;
        System.out.println("Enter number of terms");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
            System.out.print(1+" ");
        else if(n==2)
            System.out.print(1+" "+1+" ");
        else {
            System.out.print(1+" "+1+" ");
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}
