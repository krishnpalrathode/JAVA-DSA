// To print all the sequence the string using recursion
package BackTracking;
import java.util.*;
import java.util.ArrayList;
public class PrintAllSequence {

    public static void printsequence(int arr[],int i,ArrayList<Integer> temparr){
        if(i==arr.length){
            if(temparr.size()>0){
                System.out.println(temparr);
            }
            return ;
        }
        printsequence(arr,i+1,temparr);
        temparr.add(arr[i]);
        printsequence(arr,i+1,temparr);
        temparr.remove(temparr.size()-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[]= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("For the array - " + Arrays.toString(arr));


       printsequence(arr,0,new ArrayList<>());
    }
}