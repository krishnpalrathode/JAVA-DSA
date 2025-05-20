package Recurssion_practise;
import java.util.*;

public class Multiplilcation {
    public static void multiples(int n,int k){

        if(k==1){
            System.out.println(n);
            return ;
        }


             multiples(n,k-1);
        System.out.println(n*k);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and k");
        int n = sc.nextInt();
        int k = sc.nextInt();
         multiples(n,k);
        System.out.println();
    }
}
