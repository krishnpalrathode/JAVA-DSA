package DATA_STRUCTURE;
import java.util.*;
import java.io.*;
public class Rotation2DMatrix {
    public static void rotatedMatrix(int[][] arr){
        //Step 1 : Transpose the 2D array
        int n=arr.length;
        int m =arr[0].length;
        for(int i=0;i<n;i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        //Step 2 : Swap the left and right side elements
        for(int i=0;i<n;i++){
           int li=0;
           int ri=m-1;
           while(li<ri){
               int temp = arr[i][ri];
               arr[i][ri]=arr[i][li];
               arr[i][li]=temp;
                li++;
                ri--;
           }
        }
    }
            public static void main(String[] args) {

                int arr[][] = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13,14,15,16}
                };
                rotatedMatrix(arr);
                for (var mat : arr) {
                    System.out.println(Arrays.toString(mat));


                }

            }}

