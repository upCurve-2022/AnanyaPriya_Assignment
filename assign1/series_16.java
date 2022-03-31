package assign1;

import java.util.Scanner;

public class series_16 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of N:");
            int n = sc.nextInt();

            int n1 = 1, a = 1, b = 4;

            for(int i =1; i <= n; i++){
                System.out.print(n1 + " ");
                n1 = n1 + b;
                if(i % 2 != 0){
                    a += 1;
                }
                else{
                    a += 2;
                }
                b = 4 * a;
            }
        }
    }

