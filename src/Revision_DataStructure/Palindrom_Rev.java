package Revision_DataStructure;
import java.util.*;
import java.io.*;

public class Palindrom_Rev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //to cheak wheather the array is palindromic or not
        int flag = -1;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]!=arr[arr.length-i-1]){
            flag++;
        }

    }
    if(flag==-1){
        System.out.println("Palindrom array");

    }
    else {
        System.out.println("Not a palindrom array");
    }

    }
}
