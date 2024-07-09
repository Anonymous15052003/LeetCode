package Contains_Duplicate;

public class bruteforce {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        if (containsDuplicate(nums)) {
            System.out.println("Duplicates present");
        }
        else{
            System.out.println("Duplicates not present");
        }
    }
}
