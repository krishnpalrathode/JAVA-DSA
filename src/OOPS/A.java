package OOPS;

import java.sql.SQLOutput;

class A {

    void showA()
    {
        System.out.println("A class method");

    }


}
class C extends B {
    void showc()
    {
        System.out.println("c class method");
    }
}
class B extends A {
    void showB()
    {
        System.out.println("b class method");

    }

    public static void main(String[] args) {
       B obj1  = new B();
       obj1.showA();
       obj1.showB();
       C obj2 = new C();
       obj2.showc();
       obj2.showB();
       obj2.showA();

    }
}
