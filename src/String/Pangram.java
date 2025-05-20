package String;

public class Pangram {

    public static void main(String[] args){
        boolean flag = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        //REMOVE THE WHITE SPACE
        str = str.replace(" ","");
        //CREATE THE CHARCTER ARRAY
        char[] arr1= str.toCharArray();
        int[] arr2= new int[26];

        for(int i=0;i<arr1.length;i++){
            arr2[arr1[i]-65]++;
        }
        for(int i=0;i<arr2.length;i++) {
            if (arr2[i] == 0) {
                System.out.println("not a pangram");
                flag = true;
            }
        }
            if(flag==false) {
                System.out.println("its a pangram");
            }



    }
}
