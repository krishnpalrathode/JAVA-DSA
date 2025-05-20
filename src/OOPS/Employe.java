package OOPS;

public class Employe {
    private int emp_id;
    public void setEmpid(int eid){
        emp_id = eid;
    }
    public int getEmpid(){
        return emp_id;
    }
}
class company{
    public static void main(String[] args) {
        Employe e = new Employe();
        e.setEmpid(101);
        System.out.println(e.getEmpid());




    }
}