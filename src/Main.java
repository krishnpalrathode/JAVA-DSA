class Student {
    int rollNo;
    String studentName;
}

    public class Main{
    public static void main(String[] args) {
      Student obj1 = new Student();
      obj1.rollNo = 1;
      obj1.studentName = "ram";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student obj2 = new Student();
        obj2.rollNo = 2;
        obj2.studentName = "shyam";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);


    }

}

