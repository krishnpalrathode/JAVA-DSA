package Recurssion_practise;
import java.util.*;

public class altersignadd {
    public static int Sumofdigits(int n,int i){
       //base case
       if(i==n+1){
           return 0;
       }
       else if(i%2==0){
           return Sumofdigits(n,i+1) - i;

           }
       else{
           return Sumofdigits(n,i+1)+i;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i =0;
        int result= Sumofdigits(n,i);
        System.out.println(result);
    }
}
