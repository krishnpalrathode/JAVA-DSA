package Recurssion_practise;
import java.util.*;

public class dise {
    public static void Noofways(int curr,String ans,int dest){
        if(curr>dest){
            return;
        }
        if(curr==dest){
            System.out.println(ans);
            return;
        }
        Noofways(curr+1,ans+String.valueOf(curr+1),dest);
        Noofways(curr+2,ans+String.valueOf(curr+2),dest);
        Noofways(curr+3,ans+String.valueOf(curr+3),dest);
        Noofways(curr+4,ans+String.valueOf(curr+4),dest);
        Noofways(curr+5,ans+String.valueOf(curr+5),dest);
        Noofways(curr+6,ans+String.valueOf(curr+6),dest);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the table");
        int n = sc.nextInt();
        int dest = n-1;
       int curr = 0;
        String ans = "";
        Noofways(curr,ans,dest);
    }
}
