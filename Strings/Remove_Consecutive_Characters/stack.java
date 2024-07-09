package Remove_Consecutive_Characters;

import java.util.Stack;

public class stack {
    public static String removeDuplicates(String s){
        Stack<Character> stk = new Stack<>();

        for (char i : s.toCharArray()){
            if (!stk.isEmpty() && i==stk.peek()){
                stk.pop();
            }
            else{
                stk.push(i);
            }
        }

        StringBuilder a = new StringBuilder();
        while (!stk.isEmpty()){
            a.append(stk.pop());
        }

        a.reverse();
        return a.toString();
    }
    public static void main(String[] args) {
        String s = "abbaca";
        String ans = removeDuplicates(s);
        System.out.println(ans);
    }
}
