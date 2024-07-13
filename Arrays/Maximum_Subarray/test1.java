package Maximum_Subarray;

public class test1 {
    public static int maxSubArray(int [] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
            max = Math.max(sum,max);
            if (sum<0) sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum is : "+maxSubArray(nums));
    }
}
