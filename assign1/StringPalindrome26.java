package assign1;

import java.util.Scanner;

public class StringPalindrome26 {
    public static void main(String []args){
        System.out.println("Enter the string ");
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.nextLine();
        int i=0,j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j))
                break;
            i++;
            j--;
        }
        if(i>=j)
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
