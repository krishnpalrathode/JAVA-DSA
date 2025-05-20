//Q5: Write a function which accepts a 2D array of integers and its size as arguments and
//        displays the elements of middle row and the elements of middle column. Printing can
//        be done in any order.

package Assignment._PW;
import java.util.*;

public class MiddleRC {
    public static void PrintMiddleRC(int n,int m,int arr[][]){
        int mid = arr.length/2;
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
          if(i==mid){
              System.out.println(arr[i][j]);
          }
          else if (j==mid){
              System.out.println(arr[i][j]);
          }
         }
     }
    }

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
        PrintMiddleRC(n,m,arr);
    }
}
