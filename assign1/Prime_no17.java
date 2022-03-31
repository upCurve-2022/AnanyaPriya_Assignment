package assign1;
import java.lang.Math;
import java.util.Scanner;

public class Prime_no17 {
    public static void main(String []args){
        int m,n,j;
        System.out.println("Enter m and n");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++){
            for(j=2;j<=i/2;j++){
                if(i%j==0)
                    break;
            }
            if(j==((i/2)+1))
                System.out.print(i+" ");
        }
        sc.close();
    }
}
