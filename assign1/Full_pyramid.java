package assign1;
import java.util.Scanner;

public class Full_pyramid {
    public static void main(String args[]){
        System.out.println("Enter number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        sc.close();
    }
}
