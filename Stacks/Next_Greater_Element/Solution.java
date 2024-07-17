package Next_Greater_Element;

import java.util.Stack;

public class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> stk = new Stack<>();
        long [] nums = new long[n];
        for (int i=n-1;i>=0;i--){
            while (!stk.isEmpty() && stk.peek()<=arr[i]){
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
}