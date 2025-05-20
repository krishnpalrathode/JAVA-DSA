package OOPS;

class Animal{
    void eat(){
        System.out.println("i am eating");
    }
}

public class inheritance1 extends Animal {
    public static void main(String[] args) {
       inheritance1 obj = new inheritance1();
        obj.eat();

    }

}
