package Multithreading;

public class daemonThread extends Thread
{
    public void run()
    {
        if (Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread");
        }

        
        System.out.println("child Thread");
    }


    public static void main(String[] args)
    {
        System.out.println("main Thread");

        daemonThread t = new daemonThread();
        t.setDaemon(true);
        t.start();
    }
}
