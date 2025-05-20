package DATA_STRUCTURE;

//Time complexity = O(n);
//Space comlixity = O(1);

//public class missingNumber {
//    public static void main(String[] args) {
//
//
//        int arr[] = {1, 2, 3, 4, 6, 7, 8};
//        int n = arr.length;
//      int sum =0;
//
//        int sum_of_natural = (n + 1) * (n + 2) / 2;
//        System.out.println(sum_of_natural);
//        for (int i = 0; i < n; i++) {
//
//         sum+=arr[i];
//
//        }
//        System.out.println(sum);
//        int num =sum_of_natural-sum;
//        System.out.println("Missing number is :"+num);
//
//
//    }
//}

public class missingNumber{
    public static void main(String args[])
    {
        int nums[]={0,2,3,4,5,6};
        int n =nums.length;
        int sum = 0;
        for(int i=0 ; i<n; i++)
        {
            sum+=nums[i];

        }
        System.out.println(sum);
        int sum_of_num = n*(n+1)/2;
        int value = sum_of_num - sum;
        System.out.println(value);
    }
}