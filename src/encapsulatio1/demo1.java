package encapsulatio1;

class Student1 {
    int age;
    String name;

    Student1(int age,String name){
        this.age=age;
        this.name=name;
    }
    Student1(){
        System.out.println("zero parameterized countructor");
    }
    void display(){
        System.out.println(age);
        System.out.println(name);
    }
}
public class demo1 {
    public static void main(String[] args){
        Student1 obj = new Student1(21,"krishna");
        obj.display();
        Student1 obj1 = new Student1();
        obj1.display();


    }
}
