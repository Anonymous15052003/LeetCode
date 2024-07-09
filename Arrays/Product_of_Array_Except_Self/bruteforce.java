package Product_of_Array_Except_Self;

import java.util.*;

public class bruteforce {
    public static List<Integer> product(int [] arr){
        List<Integer> ans = new ArrayList<>();
        int product=1;

        for (int i=0;i<arr.length;i++){
            product*=arr[i];
        }

        for (int i=0;i<arr.length;i++){
            ans.add(product/arr[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        List<Integer> ans = product(nums);
        System.out.print("{");
        for (int i : ans){
            System.out.print(i+" ");
        }
        System.out.print("}");
    }
}

// This program might suffer from divide by zero error