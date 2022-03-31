package javachallenges;
import java.io.FileOutputStream;
import java.util.Scanner;
public class datawrite9 {
    public static void main(String []args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name");
        String a=sc.nextLine();
        FileOutputStream f1=new FileOutputStream("C:\\Users\\ANANYA PRIYA\\IdeaProjects\\Assignment_level1\\src\\main\\java\\javachallenges\\def.txt");
        String b;
        System.out.println("Enter data");
        b=sc.nextLine()+"\n";
        byte[] c=b.getBytes();
        f1.write(c);
        f1.close();

    }
}
