package Contains_Duplicate;

import java.util.HashSet;

public class hashset {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num:nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
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
