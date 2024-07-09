package Next_Permutation;

import java.util.*;

/*
 * Find longer prefix match
 * find the dip and that element will be our breakpoint
 * find element greater than breakpoint element but the smallest among all others to stay close to next permutation
 * then try to place remaining elements in sorted order
 * if there is no dip in array then return the reversed array as answer
 */

public class solution {
    public static List<Integer> nextGreaterPermutation(List<Integer> arr){
        int n = arr.size();
        int ind = -1;

        for (int i=n-2;i>=0;i--){
            if (arr.get(i)<arr.get(i+1)){
                ind = i;
                break;
            }
        }

        if (ind==-1){
            Collections.reverse(arr);
            return arr;
        }

        for (int i=n-1;i>ind;i--){
            if (arr.get(ind)<arr.get(i)){
                int temp=arr.get(i);
                arr.set(i,arr.get(ind));
                arr.set(ind,temp);
                break;
            }
        }

        List<Integer> subList = arr.subList(ind+1, n);
        Collections.reverse(subList);
        return arr;
    }
    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[]{2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}
