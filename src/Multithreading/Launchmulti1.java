package Multithreading;

import java.util.Scanner;

public class Launchmulti1 {

    public static void main(String[] args) {
        System.out.println("calculation task started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter the 2nd number");
        int num2 = sc.nextInt();

        int result = num1+num2;
        System.out.println("calculation task ended  "+result);

        System.out.println("***************************");

        System.out.println("printing * Task Started");
        for(int i =0;i<5;i++){
            System.out.println("*5");
        }

        System.out.println("Printing * task ended");

        System.out.println("**********************************");

        System.out.println("task ended");
    }
}
