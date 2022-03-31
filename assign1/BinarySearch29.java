package assign1;

import java.util.Scanner;

public class BinarySearch29 {


    public static void main(String[] args){
        System.out.println("Binary Search");
        int []arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements of the array");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to search");
        int elem=sc.nextInt();
        int i=bin(arr,elem);
        if(i==-1)
            System.out.println("NOT FOUND");
        else
            System.out.println(i);
        sc.close();
    }

    public static int bin(int[] ar, int ele) {
        int low = 0, high = ar.length - 1, mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (ar[mid] == ele)
                return mid;
            else if (ele > ar[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
