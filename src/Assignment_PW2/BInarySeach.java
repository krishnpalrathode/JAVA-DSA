//Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
//        Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
//        Output 1: 6
//        Input 2: arr = [ 0 0 0 0 0 1 1]
//        Output 2: 2
package Assignment_PW2;
import java.util.*;
public class BInarySeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int value =0;
        for(int i=0;i<n;i++){
         if(arr[i]==1){
             value++;
         }
        }
        System.out.println(" 1 occurs "+value+" times in the array");
    }

}
