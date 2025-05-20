package Arrays;

public class Arrtravers{


    public static void main(String[] args) {


            int[][] arr = {{56,45,45,},{84,23,46}};
            for(int i = 0;i < 2;i++){
                for(int j = 0;j < 3;j++){
                    System.out.println(arr[i][j]);
                }
            }

        int[] ages = new int[3];

        ages[0] =34;
        ages[1] =39;
        ages[2]=98;
        for(int age : ages){
            System.out.println(age);
        }

        for(int i=0;i<=2;i++){
            System.out.println(ages[i]);
        }


    }
}

