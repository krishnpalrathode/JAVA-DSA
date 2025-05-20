package OOPS;

interface Abc {
  public static final int a = 10;
   public abstract void show();
  default void display(){
      //  default method ko create kar sakte h;
   }
   static void display1(){
      // static method bhi create kar sakte h
   }
}
interface def{
    void display();
}
class test implements Abc,def
{
    public void show(){
        System.out.println("1");
    }
    public void display(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.display();
     //   Abc a = new Abc(); connot be initialated
    }
}
