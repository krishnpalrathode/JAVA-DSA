import java.util.Scanner;
public class patternA {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==1 && j>1 && j<n/2+1 || j==1 && i>1 || i==n/2+1 && j<=n/2+1 || j==n/2+1 && i>1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}
