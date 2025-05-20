package OOPS;

public class varArgs {
    void show(String a)
    {
        System.out.println("int method");

    }
    void show(String...a)
    {
        System.out.println("varargs method");
    }

    public static void main(String[] args) {
        varArgs obj = new varArgs();
        obj.show("krish","rajput","Singh");
    }
}
