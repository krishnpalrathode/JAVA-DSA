package Recurssion_practise;
import java.util.*;

public class Factorial {
    public static int factorialnum(int n)
    //base case condition
    {
        if(n==0 || n==1){
          return 1;
        }
        else{
            int result = n*factorialnum(n-1);
            return result;
        }

    }
    public static void main(String args[]){
        System.out.println("Enter the nuber ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of the given number is ");
        int result = factorialnum(n);
        System.out.println(result);
    }
}
