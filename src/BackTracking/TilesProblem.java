package BackTracking;
import java.util.*;
public class TilesProblem {
   public static int Gateway(int n){
        if(n<=3){
            return n;
        }
        else{
            return Gateway(n-1)+ Gateway(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the board");
        int n = sc.nextInt();

        int result = Gateway(n);
        System.out.println("Total no of ways are "+result);

    }

}
