package Inheritance;
import java.util.*;
abstract class shape
{
    float area;
    abstract public void input();
    abstract public void compute();
    public void display()
    {
        System.out.println("The area is"+area);
    }


}
class  Rectangle1 extends shape
{
    float length;
    float breadth;

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


}

class Square1 extends shape
{
    float length;


    public void input(){
        System.out.println("Calculation of Square app :");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of Square");
        length=scan.nextFloat();

    }
    public void compute()
    {
        area = length*length;
    }


}

class Circle1 extends shape
{
    float radius;
    float pi=3.14f;

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


}
class Geomentry
{
    public void poly(shape ref)
    {
        ref.input();
        ref.compute();
        ref.display();
    }
}

public class AreaCalulatorEffic {
    public static void main(String[] args) {
Rectangle1 rec = new Rectangle1();
Square1 Sq = new Square1();
Circle1 c = new Circle1();

Geomentry g = new Geomentry();
g.poly(rec);
g.poly(Sq);
g.poly(c);
    }
}
