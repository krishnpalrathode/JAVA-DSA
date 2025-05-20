//Q4: Write a program to find the largest element of a given 2D array of integers.

package Assignment._PW;
import java.util.*;
public class Largest2D {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt();
        System.out.println("enter the number of coulumns");
        int m = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[][]= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        int largestElement =arr[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             if (arr[i][j]>largestElement){
               // int value = arr[i][j];
                  largestElement = arr[i][j];
             }
            }
        }
        System.out.println("Largest element is "+largestElement);
    }

}
