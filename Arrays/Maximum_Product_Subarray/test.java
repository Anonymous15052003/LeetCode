package Maximum_Product_Subarray;

public class test {
    public static int maxProductSubArray(int [] arr){
        int ans = Integer.MIN_VALUE;
        int prefix = 1;
        int postfix = 1;
        int n = arr.length;

        for (int i = 0;i<n;i++){
            if (postfix==0)postfix = 1;
            if (prefix==0)prefix = 1;
            prefix = prefix * arr[i];
            postfix = postfix * arr[n-i-1];
            ans = Math.max(ans,Math.max(prefix,postfix));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}
