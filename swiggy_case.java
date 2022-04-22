package exception_handling;

import java.util.Scanner;

public class swiggy_case {
    static void validatezipcode(int zipcode) throws RepresentCustomException{
        if(zipcode==123||zipcode==456||zipcode==789)
            throw new RepresentCustomException("zip code is non-deliverable");
        else
            System.out.println("Delivery availale in your area");
    }
    public static void main(String args[]){
        try
        {
            int zipcode;
            System.out.println("Enter the zipode of your area");
            Scanner sc=new Scanner(System.in);
            zipcode=sc.nextInt();
            validatezipcode(zipcode);
        }
        catch(RepresentCustomException ex){
            System.out.println(ex);
        }
    }

}
