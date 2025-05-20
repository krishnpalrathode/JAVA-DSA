package OOPS;

public class overRidding {

    void show(int a){
        System.out.println("1");
    }

}
class Xyz extends overRidding {
    void show(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Xyz t = new Xyz();
        t.show(7);

    }

}