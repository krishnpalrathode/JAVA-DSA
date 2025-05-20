package Exeption.java;

public class throw1 {
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = -2;
        try
        {
            if(num2<0)
            {
                Exception e = new ArithmeticException("negative number :");
                throw e;
            }
            else{
                int result = num1 / num2;
                System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number "+e);
        }
    }
}
