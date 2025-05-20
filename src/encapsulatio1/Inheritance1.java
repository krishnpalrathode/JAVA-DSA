package encapsulatio1;
class Human1
{
    private String name;
    int age;
    Human1()
    {
        System.out.println("Human class constructor");
    }
    void sleep(){
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student2 extends Human1{
    void display(){
        System.out.println("the age is :"+age);
       // System.out.println("the name is :"+name);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2();
       // Human1 hu1 = new Human1(5);

        st1.sleep();
        st1.display();

    }
}
