package DATA_STRUCTURE;
import java.util.*;
import java.io.*;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter the value of element you want to search");
        int idx=-1;
        int x = sc.nextInt();
        int i;
        for(i=0;i<n;i++){
            if (arr[i]==x) {
                idx = i;
                System.out.println(idx);
                break;
            }

        }
        if(idx!=i){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Elemnet found at index"+idx);
        }


    }
}
