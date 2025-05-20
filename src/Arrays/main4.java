

public class main4 {void demoArray(){
    int[] ages = new int[3];
    float[] weight = new float[3];
    String[] names = new String[3];

    ages[0]=34;
    ages[1]=12;
    ages[2]=45;
    //   ages[5]=45;
    weight[0]=49.5f;
    weight[1]=58.68f;
    weight[2]=95.45f;

    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);

    class Main{
        public static void main(String[] args) {
            ArrayExample obj = new ArrayExample();
            obj.demoArray();

        }
    }

}

}
