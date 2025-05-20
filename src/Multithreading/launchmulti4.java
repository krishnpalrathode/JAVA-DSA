package Multithreading;
import java.util.*;

class Calc extends Thread
{
public void run()
{
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
}
}
class message extends Thread{
    public void run(){
        System.out.println("***************************");

        System.out.println("printing * Task Started");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("*5");
                Thread.sleep(2000);
            }
        }
        catch(Exception e ){
            System.out.println("something went wrong baba");
        }
        System.out.println("Printing * task ended");

        System.out.println("**********************************");

        System.out.println("task ended");
    }

}

public class launchmulti4 {
    public static void main(String[] args) {
        System.out.println("main thread started");

        Calc t1 = new Calc();

        message t2 = new message();
        t1.start();
        t2.start();

    }
}
