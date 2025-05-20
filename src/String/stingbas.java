package String;

public class stingbas {
    public static void main(String[] args) {
        String brand = "pwskill";
        System.out.println(brand);
        //now we want to update the string
        brand.concat("Bengluru");
        System.out.println(brand);


        StringBuilder brand1 = new StringBuilder("pwskills");
        System.out.println(brand1);
        brand1.append("bengluru");
        System.out.println(brand1);

    }
}
