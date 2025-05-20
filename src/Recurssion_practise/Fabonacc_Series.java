package Recurssion_practise;
import java.sql.SQLOutput;
import java.util.*;
public class Fabonacc_Series {
    public static int fabonaccseries(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fabonaccseries(n-1)+fabonaccseries(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fabonaac number :");
        int n = sc.nextInt();
        int result = fabonaccseries(n);
        System.out.println("The fabonaac of " +n+ "is "+result);


    }
}
