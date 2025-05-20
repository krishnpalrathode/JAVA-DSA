package Recurssion_practise;
import java.util.*;

public class destination2Dbox {
    public static void pathprint(int Current_col,int Current_row,int dest,int arr[][],String ans){
        if(Current_row>dest||Current_col>dest){
            return;
        }
        if(Current_row==dest || Current_col == dest){
            System.out.println(ans);
            return;
        }
        //Horrizontal move
        if(Current_col<=dest) {
            pathprint(Current_col + 1, Current_row, dest, arr, ans + Integer.toString(arr[Current_row][Current_col + 1]));
        }
if(Current_row<=dest) {
    pathprint(Current_col, Current_row + 1, dest, arr, ans + Integer.toString(arr[Current_row + 1][Current_col]));
}
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of box N*N");
        int n = sc.nextInt();
        int Current_col = 0;
        int Current_row = 0;
        int dest = n-1;
        int arr[][]= new int[Current_row][Current_col];

        String ans = "";

        pathprint(Current_row,Current_col,dest,arr,ans);
    }
}
