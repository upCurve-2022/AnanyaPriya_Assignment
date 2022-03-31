package assign1;
import java.util.Scanner;
public class Display_no_in_seq_odd {
    public static void main(String []args){
        int i,n;
        System.out.println("Enter no of terms N");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int x;
        for(x=1;x<n+1;x++){
            if((x%2)!=0){
                int z=-x;
                System.out.print(z+" ");}
            else
                System.out.print(x+" ");
        }
        sc.close();
    }
}
