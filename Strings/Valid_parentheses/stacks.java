package Valid_parentheses;

import java.util.Stack;

public class stacks {
    public static Boolean isValid(String s){
        Stack<Character> stk = new Stack<>();

        for (char i : s.toCharArray()){
            if (i=='(' || i=='{' || i=='['){
                stk.push(i);
            }
            else if (!stk.isEmpty() && ((i==')' && stk.peek()=='(') || (i=='}' && stk.peek()=='{') || (i==']' && stk.peek()=='['))){
                stk.pop();
            }
            else{
                return false;
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()";
        if (isValid(s)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
