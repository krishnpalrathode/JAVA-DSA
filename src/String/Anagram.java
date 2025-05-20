package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String str1 = "School master";
        String str2 = "The Classroom ";

        System.out.println(str1);
        System.out.println(str2);

        str1= str1.replace(" ","");
        str2 = str2.replace(" ","");

        System.out.println(str1);
        System.out.println(str2);


        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(str1);
        System.out.println(str2);


        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();

        System.out.println(arr1);
        System.out.println(arr2);


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);


        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("It's an Anagram");
        }
        else{
            System.out.println("not an Anagram");
        }
    }
}