package OOPS;
interface Car
{
    void run();

}


public class Annonymousclass {
    public static void main(String[] args) {
        Car obj = () -> System.out.println("running ..");


        obj.run();
    }
}
