package Arrays;


    class calc
    {
        public int add(int nums[])
        {
            int result = 0;
            for(int n : nums){
                result = result + n;
            }
            return result;
        }
    }
    public class demo {
        public static void main(String[] args) {
calc obj = new calc();
int nums[] = {5,43,7,5};
int result = obj.add(nums);
            System.out.println(result);

        }
    }
