package encapsulatio1;
class Student
{
private int age;
private String name;

    public void setAge(int age)
    {
        this.age = age;

    }
    public int getAge(){
        return age;
    }
    public void setName(String name)
    {
        this.name =name;
    }
    public String getName(){
        return name;
    }



    }

public class demo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.setAge(18);
        s.setName("krishna");
        int stud1Age = s.getAge();
        System.out.println(stud1Age);
        String stud1Name = s.getName();
        System.out.println(stud1Name);


    }
}
