package OOPS;

import java.sql.SQLOutput;

interface Aa
{
    void show();
   default void config()
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}


class Bb implements Aa
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class java8fet {
    public static void main(String[] args) {
        Aa.abc();
        Aa obj = new Bb();
        obj.show();
        obj.config();

    }
}
