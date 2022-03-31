package assign1;

import java.util.Scanner;

public class DecToBin19 {
    public static void main(String []args){
        int n,remain;
        String rem=" ";
        System.out.println("Enter decimmal number N");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==1)
            System.out.println(1);
        else {
            while (n != 1) {
                remain = n % 2;
                rem = Integer.toString(remain) + rem;
                n = n / 2;
            }
            rem = "1" + rem;
            System.out.println(rem);
        }
    }
}
