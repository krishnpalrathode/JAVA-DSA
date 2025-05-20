package OOPS;
interface AB
{
    void show();
}
interface Xy
{
    void Show1();
}
abstract class BC implements AB,Xy
{
public void show()
{
    System.out.println("in show");
}
public void show1(){
    System.out.println("Show1");
}
}
public class interface2 {
    public static void main(String[] args) {
      //  BC obj = new BC();
      //  obj.show();
    }

}
