package Exeption.java;

public class Throws {
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = 0;
        try {
           int num[] = {1,2,3};
            System.out.println(num[10]);
        }
        catch(Exception e)
        {
            System.out.println("enter a valid number"+e);
        }
    }
}
