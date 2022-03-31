import java.util.Scanner;
public class Half_pyramid {
    public static void main(String args[])
    {
        System.out.println("Enter number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int i;
        for(i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
