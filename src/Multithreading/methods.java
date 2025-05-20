package Multithreading;

public class methods extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        methods t = new methods();

        System.out.println(Thread.currentThread().getName());
        t.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t.isAlive());



//        System.out.println("Hello");
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("krishna");
//        System.out.println("new thread name is"+ Thread.currentThread().getName());

    }
}
