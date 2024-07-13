package Training;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (char i : s.toCharArray()){
            if (i=='(' || i=='[' || i=='{'){
                stk.push(i);
            }
            else if (!stk.isEmpty() && ((i==')' && stk.peek()=='(') || (i==']' && stk.peek()=='[') || (i=='}' && stk.peek()=='{'))){
                stk.pop();
            }
            else{
                return false;
            }
        }
        return stk.isEmpty();
    }
}