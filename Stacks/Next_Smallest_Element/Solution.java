package Next_Smallest_Element;

import java.util.Stack;

public class Solution {
    public static int [] printNSE(int [] arr,int n){
        Stack<Integer> stk = new Stack<>();
        int [] nums=new int[n];
        for (int i=n-1;i>=0;i--){
            while (!stk.isEmpty() && stk.peek()>=arr[i]){
                stk.pop();
            }
            if (stk.isEmpty()){
                nums[i]=-1;
            }
            else{
                nums[i]=stk.peek();
            }
            stk.push(arr[i]);
        }
        return nums;
    }
    public static void main(String args[])
    {
        int arr[] = { 4, 8, 5, 2, 25 };
        int n = arr.length;
        int [] ans = printNSE(arr, n);
        for (int i:ans){
            System.out.print(i+" ");
        }
    }
}