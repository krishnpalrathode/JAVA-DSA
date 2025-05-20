package Inheritance;
class Aeroplane
{
    public void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane{
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void takeoff(){
        System.out.println("cargo plane carries goods");
    }

}
class PassengerPlane extends Aeroplane{
    public void fly()
    {
        System.out.println("Passanger plane flies at high height");
    }
    public void takeoff()
    {
        System.out.println("passanger plane carries passanger");
    }

}
class Airport
{
    public void poly(Aeroplane ref)
    {
    ref.takeoff();
    ref.fly();

        System.out.println("--------------------------");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
   Aeroplane cp =  new CargoPlane();

    PassengerPlane pp = new PassengerPlane();
    Airport a = new Airport();
    a.poly(cp);
    a.poly(pp);
    
    }

}
