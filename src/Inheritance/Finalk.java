package Inheritance;
 class Animal1
{
    final int age= 19;
    final void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal1
{

}
public class Finalk {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();

    }
}
