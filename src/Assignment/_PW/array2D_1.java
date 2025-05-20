//Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
//        number of positive numbers
//        number of negative numbers
//        number of odd numbers
//        number of even numbers
//        number of 0.
//
// time complexity O(n2)
// space complexity O(1)


package Assignment._PW;

import java.util.*;
public class array2D_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt();
        System.out.println("enter the number of coulumns");
        int m = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[][]= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

           System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }
        int positive = 0;
        int negative =0;
        int zero =0;
        int even =0;
        int odd=0;



     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
             if(arr[i][j]>0){
             positive++;

             }
             else if (arr[i][j]<0){
                 negative++;
             }
             else{
                 zero++;
             }
        if(arr[i][j]%2==0){
        even++;
        }
        else{
            odd++;
        }
    }
     }
        System.out.println("Number of positive number are  : "+positive);
        System.out.println("NUmber of negative number are  : "+negative);
        System.out.println("NUmber of zero are  : "+ zero);
        System.out.println("Number of even are  : "+ even);
        System.out.println("Number of odd are  : " +odd);
        sc.close();

    }
}
