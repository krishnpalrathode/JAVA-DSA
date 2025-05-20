package Multithreading;
import java.util.*;

class calc1 implements Runnable{
    public void run(){
        System.out.println("calculation task started");
        System.out.println("Please enter the first number :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("please enter the second number ");
        int num2 = sc.nextInt();

        int result = num1+num2;
        System.out.println(result);
        System.out.println("task ended");
    }
class message implements Runnable{
        public void run(){
            System.out.println("printing task started");
            System.out.println("***************");
            for(int i =0;i<=3;i++){
                System.out.println("5*");
            }
            System.out.println("printing task ended");
        }
}

}

public class launchmulti5 {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        calc1 c1 = new calc1();
        message m1 = new message();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);

        t1.start();
        t2.start();


    }
}
