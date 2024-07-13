package Evaluate_Reverse_Polish_Notation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for (String token : tokens) {
            if (token.matches("-?\\d+")) { // Check if token is a number
                stk.push(Integer.parseInt(token)); // Parse token as an integer and push onto stack
            } else {
                int op2 = stk.pop();
                int op1 = stk.pop();
                
                switch (token) {
                    case "+":
                        stk.push(op1 + op2);
                        break;
                    case "-":
                        stk.push(op1 - op2);
                        break;
                    case "*":
                        stk.push(op1 * op2);
                        break;
                    case "/":
                        if (op2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stk.push(op1 / op2);
                        break;
                    case "^":
                        stk.push((int) Math.pow(op1, op2));
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        
        return stk.peek();
    }
}
