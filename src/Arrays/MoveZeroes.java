package Arrays;

public class MoveZeroes
{
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);

    }
}
