package SprintOne;
import java.util.*;
public class SquareRoot {

    static int Squarerootis(int arr[] ,int num){
        int st = 0;
        int end = arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int val=mid*mid;
            if(val==num){
                return mid;

            }
            else if(val>num){
                end=mid-1;

            }
            else{
                st=mid+1;
                ans=mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int arr[] = new int[num];
        int result = Squarerootis(arr,num);
        System.out.println(result);
    }
}
