package Multithreading;

import java.sql.SQLOutput;

public class launchmulti6 implements Runnable
{
    public void run()
    {
        System.out.println("Thread Created");
    }

    public static void main(String[] args) {
        launchmulti6 t = new launchmulti6();
        Thread th = new Thread(t);
        th.run();

    }
}
