package DATA_STRUCTURE;
//Time complexity : O(n)
//Space Complexity :O(1)
class ReversalArr{

    public static void main(String[] args)
    {
        int arr[]= {1,3,5,67,8,7,9};
        int n = arr.length;
        for(int i =0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversal of an array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
