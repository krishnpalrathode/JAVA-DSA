package Multithreading;

public class Launchmulti2
{
    public static void main(String[] args)
    {
        System.out.println("main Thread");
        System.out.println("before changing");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println("the priority of main thread is"+Thread.currentThread().getPriority());

        System.out.println("after changing");
        Thread t = Thread.currentThread();
        t.setName("pw");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println(name1);
        System.out.println("The priority of main thread is "+Thread.currentThread().getPriority());



    }
}
