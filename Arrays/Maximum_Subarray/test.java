package Maximum_Subarray;

public class test {
    public static int maxSubArray(int [] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i=0;i<n;i++){
            sum += arr[i];
            maxi = Math.max(sum,maxi);

            if (sum<0)sum=0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum is : "+maxSubArray(nums));
    }
}
