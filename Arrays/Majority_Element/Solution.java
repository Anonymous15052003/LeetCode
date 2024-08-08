package Majority_Element;

import java.util.*;

public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int i : nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (entry.getValue()>(n/2)){
                return entry.getKey();
            }
        }
        return -1;
    }
}