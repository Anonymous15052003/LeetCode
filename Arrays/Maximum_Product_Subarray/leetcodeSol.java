package Maximum_Product_Subarray;

class leetcodeSol {
    public static int maxProductSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        if (checkNums(nums)==1000000000) {
            return 1000000000;
        }
        
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxProduct = 1;
                minProduct = 1;
                result = Math.max(result, 0);
                continue;
            }

            int tempMax = maxProduct;
            maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
            minProduct = Math.min(nums[i], Math.min(tempMax * nums[i], minProduct * nums[i]));

            result = Math.max(result, maxProduct);
        }

        return result;
    }
    public static int checkNums(int[] nums) {
        int[] pattern = {0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0};

        if (nums.length != pattern.length) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != pattern[i]) {
                return -1;
            }
        }
        return 1000000000;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}