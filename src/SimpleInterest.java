import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("enter the amount");
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();

        System.out.println("enter the rate");
        float r = sc.nextFloat();
        System.out.println("enter the time period");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("simple Intrest"+si);
    }
}
