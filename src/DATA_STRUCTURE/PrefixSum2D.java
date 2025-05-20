package DATA_STRUCTURE;
import java.util.*;
import java.io.*;
public class PrefixSum2D {
    public static int findMatrix(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of coulombs");
        int n = sc.nextInt();

        System.out.println("Enter the element of array");

        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int r1, c1, r2, c2;
        System.out.println("Enter the value of r1");
        r1 = sc.nextInt();

        System.out.println("Enter the coulomn of c1");
        c1 = sc.nextInt();

        System.out.println("Enter thr value of r2");
        r2 = sc.nextInt();

        System.out.println("enter the value of c2");
        c2 = sc.nextInt();


        int result = findMatrix(arr, r1, c1, r2, c2);
        System.out.println("yhe sum is" + result);


    }
}