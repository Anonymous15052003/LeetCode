package Contains_Duplicate;

import java.util.HashMap;

public class test2 {
    public static boolean containsDuplicate(int [] arr){
        HashMap<Integer,Integer> ans = new HashMap<>();

        for (int i : arr){
            if (ans.containsKey(i) && ans.get(i)>=1){
                return true;
            }
            ans.put(i,ans.getOrDefault(i,0)+1);
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
