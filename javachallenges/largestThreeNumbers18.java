package javachallenges;
import java.util.Scanner;
public class largestThreeNumbers18 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest;
        int x=(a>b&&a>c)?a:((b>a&&b>c)?b:c);
//        if(a>b&&a>c)
//            largest=a;
//        else if(b>a&&b>c)
//            largest=b;
//        else
//            largest=c;
        System.out.println(x);
    }
}
