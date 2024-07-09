package Maximum_Product_Subarray;

public class optimalSol {
    public static int maxProductSubArray(int [] arr){
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i=0;i<n;i++){
            if (prefix==0){
                prefix=1;
            }
            if (suffix==0){
                suffix=1;
            }
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            ans = Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}
