package assign1;

import java.util.Scanner;

public class series_21 {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of terms in the series:");
            int n = sc.nextInt();

            int a = 1, b = 1;

            for(int i =1; i <= n; i++){
                if(i % 2 == 0){
                    System.out.print(b * -1 + " ");
                }
                else{
                    System.out.print(b + " ");
                }

                a = i * i;
                b += a;
            }

        }
    }

