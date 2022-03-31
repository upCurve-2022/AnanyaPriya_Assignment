package stringassign;
import java.util.Scanner;
public class stringContainsDigit3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        int i,j;
        for(i=0;i<a.length();i++)
        {

                if(a.charAt(i)!='0'&&a.charAt(i)!='1'&&a.charAt(i)!='2'&&a.charAt(i)!='3'&&a.charAt(i)!='4'&&a.charAt(i)!='5'&&a.charAt(i)!='6'&&a.charAt(i)!='7'&&a.charAt(i)!='8'&&a.charAt(i)!='9') {
                    System.out.println("String doesnot contain only digit");
                    break;
                }


        }
        if(i==a.length())
            System.out.println("String contains only digit");
    }
}
