package Recurssion_practise;
import java.util.*;

public class Paranthesis {
    public static void printParanthsis(int n,int oc,int cc,String s){
        if(oc==n && cc==n){
            System.out.println(s);
            return;
        }
        if(oc<n){
            printParanthsis(n,oc+1,cc,s+'(');

        }
        if(cc<oc){
            printParanthsis(n,oc,cc+1,s+')');
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of balanced paranthesis");
        int n = sc.nextInt();
        int oc = 0;
        int cc = 0;
        String s = "";
        printParanthsis(n,oc,cc,s);

    }
}
