package Training;

import java.util.Scanner;

public class PostfixEvaluation {
    static int [] stack = new int[100];
    static int top = -1;

    static void push(int c){
        stack[++top] = c;
    }

    static int pop(){
        if (top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return stack[top--];
        }
    }

    static int posteval(String exp){
        for (int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if (Character.isDigit(c)){
                push(Character.getNumericValue(c));
            }
            else{
                int op2 = pop();
                int op1 = pop();
                switch (c) {
                    case '+' : push(op1+op2);break;
                    case '-' : push(op1-op2);break;
                    case '*' : push(op1*op2);break;
                    case '/' : push(op1/op2);break;
                    case '^' : push((int) Math.pow(op1, op2));break;
                    default : System.out.println("Invalid operator");
                    System.exit(0);
                }
            }
        }
        return stack[top];
    }
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the postfix expression");
		String in=s.nextLine();
		System.out.println("The postfix expression is"+in);
		
		int result=posteval(in);
		System.out.println("The result is"+result);
        s.close();
	}
}