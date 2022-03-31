package assign1;

import java.util.Scanner;

public class Lineararray28 {
    public static void main(String []args){
        System.out.println("Linear search in array");
        int []arr;
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to search in the array");
        int elem=sc.nextInt();
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==elem)
                break;
        }
        if(i==n)
            System.out.println("Number not found");
        else
            System.out.println("Number found at index "+i);
    }
}
