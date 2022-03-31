package assign1;

import java.util.Scanner;

public class Seq23 {
    public static void main(String []args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms");
        n=sc.nextInt();
        int j=1,k=2;
        for(int i=0;i<n;i=i+1){
            System.out.print(j+" ");
            j=j+3;
            i++;
            if(i==n)
                break;
            System.out.print(-k+" ");
            k=k+4;
        }
        sc.close();
    }
}
