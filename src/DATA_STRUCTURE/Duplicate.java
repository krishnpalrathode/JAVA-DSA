package DATA_STRUCTURE;


    public class Duplicate{
        public static void main(String[] args){
            int arr[]={1,2,3,4,5,6,4};
            int n = arr.length;
            int flag = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        System.out.println("Duplicate element found"  +arr[i]);
                        flag = 1;
                    }
                }
            }
            if(flag==0){
                System.out.println("Not found");
            }
        }
    }

