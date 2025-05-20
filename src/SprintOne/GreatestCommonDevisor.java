package SprintOne;

import java.util.Scanner;

//Finding the Greatest Common Divisor (GCD)
//        Difficulty: Easy
//        Topics: Basic Programming, Number Theory
//        Description: Write a program to find the GCD of two numbers.
//        Example:
//        Input: a = 48, b = 18
//        Output: 6
//        Explanation: The GCD of 48 and 18 is 6.
public class GreatestCommonDevisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int gcd = 1;
        if (a > b) {
            for (int i = 1; i <=b; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <=a; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }

        }
        System.out.println(gcd);
    }}
