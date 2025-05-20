package OOPS.Revision;

public class useStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll(101);
        s.setName("Amit");
        s.setPer(82.9);

        System.out.println("Roll: " + s.getRoll());
        System.out.println("Name: " + s.getName());
        System.out.println("Percentage: " + s.getPer());
    }
}
