package Multithreading;

class MyThread extends Thread{
    public void run()
    {
        System.out.println("child Thread");
    }
}
public class Launchmulti3
{
    public static void main(String[] args)
    {
        System.out.println("main thread");

        MyThread t = new MyThread();
        t.start();
    }
}
