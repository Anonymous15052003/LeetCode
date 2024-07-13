package Training;

import java.util.Scanner;

public class InfixPostfixChange {
    static char [] stack = new char[100];
    static int top = -1;

    static int prec(char c){
        switch(c){
            case '+':
            case '-':
                    return 1;
            case '*':
            case '/':
                    return 2;
            case '^':
            case '%':
                    return 3;
            default:
                    return -1;
        }
    }

    static void push(char c){
        stack[++top] = c;
    }

    static char pop(){
        if (top==stack.length-1){
            System.out.println("Stack Underflow");
            return '#';
        }
        else{
            return stack[top--];
        }
    }

    static String infixPostfix(String s){
        push('#');
        StringBuilder res = new StringBuilder();

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                res.append(c);
            }
            else if (c=='('){
                push(c);
            }
            else if (c==')'){
                while (stack[top]!='('){
                    res.append(pop());
                }
                pop();
            }
            else{
                while (prec(stack[top])>=prec(c)){
                    res.append(pop());
                }
                push(c);
            }
        }
        while (stack[top]!='#'){
            res.append(pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the infix expression:");
        String inf = s.nextLine();
        System.out.println("The infix expression is: " + inf);

        String post = infixPostfix(inf);
        System.out.println("The postfix expression is: " + post);
        s.close();
    }
}