package BackTracking;
import java.util.*;
public class N_Queen {
public static void printSolution(int[][] board,int n){
    for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           System.out.print(board[i][j]+" ");
       }
        System.out.println();
    }
}
public static boolean isSafe(int[][] board,int row,int column,int n)
{
int i,j;
    //check on the left row

    //check for the upper diagonal in the left direction
    
    //check for the lower diagonal in the left direction
    return true;
}
}
