package Training;

import java.util.*;

public class InfixTooPostfix {
    static char[] stack = new char[100];
    static int top = -1;

    static int prec(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '$':
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    static void push(char ele) {
        stack[++top] = ele;
    }

    static char pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return '#';
        } else {
            return stack[top--];
        }
    }

    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        push('#');

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    result.append(pop());
                }
                pop();
            } else {
                while (prec(stack[top]) >= prec(c)) {
                    result.append(pop());
                }
                push(c);
            }
        }

        while (stack[top] != '#') {
            result.append(pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the infix expression:");
        String inf = s.nextLine();
        System.out.println("The infix expression is: " + inf);

        String post = infixToPostfix(inf);
        System.out.println("The postfix expression is: " + post);
        s.close();
    }
}
