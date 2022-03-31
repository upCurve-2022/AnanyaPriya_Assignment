package javachallenges;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//Write a java program to create a file in java.
public class createfile8 {
    public static void main(String args[]){
        File file=new File("C:\\Users\\ANANYA PRIYA\\IdeaProjects\\Assignment_level1\\src\\main\\java\\javachallenges\\def.txt");
        boolean res;
        try
        {
            res=file.createNewFile();
            if(res)
                System.out.println("file created");
            else
                System.out.println("file exists");
        }
        catch(Exception ex){
            System.out.println(ex);
        }

    }
}
