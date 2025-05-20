package Inheritance;
import java.util.*;

class Rectangle
{
    float length;
    float breadth;
    float area;
    public void input(){
        System.out.println("Calculation area app :");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        length=scan.nextFloat();
        System.out.println("Enter the breadth of rectangle");
        breadth = scan.nextFloat();
    }
    public void compute()
    {
        area = length*breadth;
    }
    public void display()
    {
        System.out.println("The area of Rectangle is :"+area);
    }

}

class Square
{
    float length;

    float area;
    public void input(){
        System.out.println("Calculation of rectangle app :");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        length=scan.nextFloat();

    }
    public void compute()
    {
        area = length*length;
    }
    public void display()
    {
        System.out.println("The area of Square is :"+area);
    }

}

class Circle
{
    float radius;
    float pi=3.14f;
    float area;
    public void input(){
        System.out.println("Calculation of circle app :");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        radius=scan.nextFloat();

    }
    public void compute()
    {
        area = pi * radius * radius;
    }
    public void display()
    {
        System.out.println("The area of circle is :"+area);
    }

}



public class AreaCal {
    public static void main(String[] args) {
    Rectangle R = new Rectangle();
    R.input();
    R.compute();
    R.display();

    Square Sq = new Square();
    Sq.input();
    Sq.compute();
    Sq.display();

    Circle C = new Circle();
    C.input();
    C.compute();
    C.display();
    }
}
