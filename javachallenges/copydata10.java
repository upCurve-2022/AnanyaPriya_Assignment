package javachallenges;
import java.util.Scanner;
import java.io.*;
public class copydata10{
    public static void copycontent(File a,File b) throws Exception{
        FileInputStream f1=new FileInputStream(a);
        FileOutputStream f2=new FileOutputStream(b);
        try {
            int n;
            while ((n = f1.read()) != -1)
                f2.write(n);
        }
        finally {
            if(f1!=null)
                f1.close();
            if(f2!=null)
                f2.close();
        }


    }
    public static void main(String []args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source file name");
        String a=sc.nextLine();
        File x=new File("C:\\Users\\ANANYA PRIYA\\IdeaProjects\\Assignment_level1\\src\\main\\java\\javachallenges\\"+a);

        System.out.println("Enter destination file name");
        String b=sc.nextLine();
        File y=new File("C:\\Users\\ANANYA PRIYA\\IdeaProjects\\Assignment_level1\\src\\main\\java\\javachallenges\\"+b);
        copycontent(x,y);
    }
}
