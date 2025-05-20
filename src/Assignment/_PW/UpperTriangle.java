//time and space complexity both are O(m*n)

package Assignment._PW;
import java.util.*;
public class UpperTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of Coulumb");
        int m = sc.nextInt();
        System.out.println("Enter the elemnts of the array");
        int arr[][]= new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-i-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
