//Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
 //       in any order.

package Assignment._PW;
import java.util.*;
public class PrintDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows n");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns m");
        int m = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
                else if(i+j==arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }

            }
        }
        sc.close();
    }
}
