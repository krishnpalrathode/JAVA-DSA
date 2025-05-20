package DATA_STRUCTURE;

public class Palindrom1 {

    public static void main(String[] args)
        {
            int arr[] = {1, 2, 3, 4, 3, 2, 1};
            int n = arr.length;
            int flag = 0;
            for (int i = 0; i < n / 2; i++) {
                if (arr[i] != arr[n - i - 1])
                {
                    System.out.println(" Not a Palindromoic array");
                    flag=1;
                    break;
                }

       } if(flag==0){
                    System.out.println("palindromic array");
            }

        }
    }
