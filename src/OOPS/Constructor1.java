package OOPS;
class Demo1
{
    int a,b;
    public Demo1(){
        System.out.println("Parent class constructor");
    }
    public Demo1(int x,int y){
        System.out.println("parameterized parent class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {   this(10,30);
        System.out.println("child class constructor");
    }
    public Demo2(int x,int y)
    {
        super();
        System.out.println("Parameterised child class constructor");
    m=x;
    n=y;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
    Demo2 d = new Demo2();
   // Demo2 d2 = new Demo2(10,34);
    }
}
