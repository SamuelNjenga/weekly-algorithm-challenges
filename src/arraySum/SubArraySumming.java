package arraySum;

public class SubArraySumming {
    private static void subArraySum(int arr[], int n, int sum){
        int curr_sum, i, j;
        for(i = 0;i < n;i++){
            curr_sum = arr[i];
            for(j = i+1;j <= n;j++){
                if(curr_sum == sum)
                {
                    System.out.println("Sum found between indexes i" +i +
                            "and j which is" +(j-1));

                }
                if(curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }

        }
        System.out.println("No sub array found");
    }
    public static void main(String[] args) {
int[] array = {1,4,0,0,3,10,5};
        subArraySum(array,array.length,7);
    }
}
