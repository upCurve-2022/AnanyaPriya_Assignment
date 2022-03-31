package assign1;

import java.util.Scanner;

public class Display_sq_power_n {
    public static void main(String []args){
        int n,product;
        System.out.println("Enter N");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            product=1;
            for(int j=1;j<=i;j++)
                 product=i*product;
            System.out.print(product+" ");
        }
        sc.close();
    }
}
