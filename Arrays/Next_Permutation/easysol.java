package Next_Permutation;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > ind; i--) {
            if (nums[ind] < nums[i]) {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }

        reverse(nums, ind + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] param_1 = {1, 2, 3};
        sol.nextPermutation(param_1);
        System.out.println(Arrays.toString(param_1)); // Output: [1, 3, 2]
    }
}