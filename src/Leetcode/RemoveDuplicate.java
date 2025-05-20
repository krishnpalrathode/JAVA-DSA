package Leetcode;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2= new int[nums.length];
        int k =1;
        int m=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                k++;
            }
        }

        for(int i=1;i<nums.length;i++){
            nums2[0]=nums[0];
            if(nums[i]!=nums[i-1]){
                m++;
              nums2[m] = nums[i];
            }


        }
        for(int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]+" ");
        }

    }
}
