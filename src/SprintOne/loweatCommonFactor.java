package SprintOne;


import java.util.Scanner;

//Finding the Least Common Multiple (LCM)
//        Difficulty: Easy
//        Topics: Basic Programming, Number Theory
//        Description: Write a program to find the LCM of two numbers.
//        Example:
//        Input: a = 12, b = 15
//        Output: 60
//        Explanation: The LCM of 12 and 15 is 60.
public class loweatCommonFactor {
    public static void main(String[] args) {
        System.out.println("Enter the value of a ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        int lcm = 1;
        if(a>b){
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    lcm=lcm*i;
                    a=a/i;
                }
                if(b%i==0){
                    lcm=lcm*i;
                    b=a/i;
                }
            }
    }
        else{
            for(int i=1;i<=b;i++){
                if(a%i==0){
                    lcm=lcm*i;
                    a=a/i;
                }
                if(b%i==0){
                    lcm=lcm*i;
                    b=a/i;
                }
            }
        }
        System.out.println(lcm);
}
}
