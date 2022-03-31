package javachallenges;
//Write a java program to calculate the volume of the cylinder.
import java.util.Scanner;

public class volumeofcyl2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius=sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height=sc.nextDouble();
        double volume=3.14*(radius*radius)*height;
        System.out.println("Volume is "+volume);
    }
}
