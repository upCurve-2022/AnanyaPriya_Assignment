package assign1;

import java.util.Scanner;

public class Display_no_in_seq {
    public static void main(String []args){
        int i,n;
        System.out.println("Enter no of terms N");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x=1;
        for(i=2;x<=n;i=i+2){
            System.out.print(i*i+" ");
            x++;
        }
    }
}
