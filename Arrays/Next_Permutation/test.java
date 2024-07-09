package Next_Permutation;

import java.util.*;

public class test {
    public static List<Integer> nextGreaterPermutation(List<Integer> arr){
        int ind = -1;
        int n = arr.size();
        for (int i=n-2;i>=0;i--){
            if (arr.get(i)<arr.get(i+1)){
                ind = i;
            }
        }

        if (ind == -1){
            Collections.reverse(arr);
            return arr;
        }

        for (int i=n-1;i>ind;i--){
            if (arr.get(ind)<arr.get(i)){
                int temp = arr.get(i);
                arr.set(i,arr.get(ind));
                arr.set(ind,temp);
                break;
            }
        }

        List<Integer> subArr = arr.subList(ind+1,n);
        Collections.reverse(subArr);
        return arr;
    }
    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}
