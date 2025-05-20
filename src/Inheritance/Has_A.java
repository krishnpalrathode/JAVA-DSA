package Inheritance;
class Car1
{
    private Engine engine;

    public Car1(Engine engine)
    {
        this.engine= engine;
    }
    public void start()
    {
    engine.engineStart();
    }
}
class Engine
{
  public void engineStart()
  {
      System.out.println("Starting");
  }
}
public class Has_A {
    public static void main(String[] args) {
        Engine e = new Engine();
        Car1 c = new Car1(e);
        c.start();

    }

}
