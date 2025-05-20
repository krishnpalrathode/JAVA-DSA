
package Arrays;

public class FrequencyArray {
    public static void main(String[] args) {


        int arr[] = {2, 3, 3, 1, 4, 5, 4, 3, 4};
        int n = arr.length;
        int max = 5;
        int count[] = new int[max + 1];
        for(int i=0;i<n;i++){
        count[arr[i]]++;
        }
        for(int i=0;i< count.length;i++)
        {
            System.out.print(count[i]+" ");
        }
    }

}





























