package Assignment._PW;
import java.util.*;
public class Print_Even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int num:arr){
            if (num % 2 == 0){
                System.out.println(num);
            }

        }
    }
}
