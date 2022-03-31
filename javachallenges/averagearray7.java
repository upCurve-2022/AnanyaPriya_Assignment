package javachallenges;

import java.util.Scanner;
//Write a java program to calculate the average value of the array elements.
public class averagearray7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of size of array");
        int n=sc.nextInt();
        double a[]=new double[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
            a[i]=sc.nextDouble();
        double sum=0;
        for(int i=0;i<n;i++)
            sum=sum+a[i];
        double average=sum/n;
        System.out.println("Average is "+average);

    }
}
