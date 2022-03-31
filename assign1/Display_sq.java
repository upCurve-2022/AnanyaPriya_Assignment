package assign1;

import java.util.Scanner;

public class Display_sq {
    public static void main(String []args){
        int a=1,b=4,c=7;
        int n;
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==1)
            System.out.print("1 ");
        if(n==2)
            System.out.print("1 4 ");
        else{
            System.out.print("1 4 7 ");
            for(int i=4;i<=n;i++){
                int number=a+b+c;
                System.out.print(number+" ");
                a=b;
                b=c;
                c=number;
            }
        }
        sc.close();

    }
}
