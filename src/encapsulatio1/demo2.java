package encapsulatio1;

class Student3{
    int age;
    String name;
    Student3(){
        age = 18;
        name = "krishna";
    }
    Student3(int age){
        this.age= age;
        name = "rahul";
    }
    Student3(int age,String name){
    this.age=age;
    this.name=name;
    }
    void display(){
        System.out.println(age);
        System.out.println(name);
    }




}

public class demo2 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.display();
        Student3 s2 = new Student3(12);
        s2.display();
        Student3 s3 = new Student3(34,"ramesh");
        s3.display();

    }
}
