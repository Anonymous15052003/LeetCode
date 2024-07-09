package Product_of_Array_Except_Self;

public class test {
    public static int [] productExceptSelf(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];

        ans[0] = 1;

        for (int i=1;i<n;i++){
            ans[i] = arr[i-1] * ans[i-1];
        }

        int postfix = 1;

        for (int i=n-1;i>=0;i--){
            ans[i] = postfix*ans[i];
            postfix = postfix*arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
