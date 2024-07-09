package ThreeSum;
import java.util.*;
public class twosum {
    public static int [] sumoftwo(int [] nums, int target){
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while (i<j){
            if (nums[i]+nums[j]==target){
                return new int[]{i, j};
            }
            else if (nums[i]+nums[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        for (int k:sumoftwo(nums,target)){
            System.out.print(k+",");
        }
    }
}