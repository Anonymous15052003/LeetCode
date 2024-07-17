package Longest_Valid_String;

import java.util.Stack;

public class Main {
    public static int findMaxLen(String str) {
        int n = str.length();
        
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(')
                stk.push(i);

            else {
                if (!stk.isEmpty() && str.charAt(stk.peek()) == '(')
                    stk.pop();
                // If stack is empty, push current index as base for next valid substring
                else
                    stk.push(i);
            }
        }

        // Initialize the result, 'last' is initialized to calculate the distance
        int result = 0, last = n;

        while (!stk.isEmpty()) {
            int now = stk.pop();
            
            // take the maximum in result
            result = Math.max(result, last - now - 1);
            
            // update the last index with current index
            last = now;
        }

        // return the maximum of last and result
        return Math.max(result, last);
    }

    public static void main(String[] args) {
        String str = "((()()";
        System.out.println(findMaxLen(str));

        str = "()(()))))";
        System.out.println(findMaxLen(str));
    }
}
