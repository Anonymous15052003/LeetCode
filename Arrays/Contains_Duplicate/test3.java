package Contains_Duplicate;

import java.util.HashSet;

public class test3 {
    public static boolean containsDuplicate(int [] arr){
        HashSet<Integer>  ans = new HashSet<>();

        for (int i : arr){
            if (ans.contains(i)){
                return true;
            }
            ans.add(i);
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
