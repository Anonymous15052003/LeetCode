package ThreeSum;

import java.util.*;

public class twoforloop {
    public static List<List<Integer>> triplet(int [] nums, int n){
        Set<List<Integer>> st = new HashSet<>();

        for (int i=0;i<n;i++){
            Set<Integer> hashset = new HashSet<>();
            for (int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if (hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        int n = nums.length;
        List<List<Integer>> l = triplet(nums,n);
        for (List<Integer> it : l){
            System.out.print("[");
            for (int i:it){
                System.out.print(i+" ");
            }
            System.out.print("]");
        }
    }
}
