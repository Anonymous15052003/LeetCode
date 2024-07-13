package Training;

import java.util.Scanner;

public class CheckBalancedString {
	static char stack[]=new char[50];
	static int top=-1;
	
	static void push(char ele) {
        stack[++top]=ele;
    }
	
	static char pop() {
		if(top==-1) {
			System.out.println("Underflow");
			return '#';
		}
		else {
			return(stack[top--]);
		}
	}

	public static boolean checkExp(String ex) {

        for(int i=0;i<ex.length();i++) {
            char c=ex.charAt(i);

            if(c=='('||c=='['||c=='{') {
                push(c);
            }
            else {
                if(top==-1) {
                    return false;
                }

                switch(c) {
                    case ')':if(stack[top]=='{'||stack[top]=='[')
                                return false;
                            else if(stack[top]=='(')
                                    pop();
                            break;
                    case '}':if(stack[top]=='('||stack[top]=='[')
                                return false;
                            else if(stack[top]=='{')
                                    pop();
                            break;
                    case ']':if(stack[top]=='{'||stack[top]=='(')
                                return false;
                            else if(stack[top]=='[')
                                    pop();
                            break;
                
                            default:break;
                }
            }
        }
        if(top==-1) return true;
        else return false;
	}
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the expression");
		String exp=s.nextLine();
		System.out.println("The expression is : "+exp);
		boolean res=checkExp(exp);
		if(res)
				System.out.println("It's a Balanced expression");
		else
			System.out.println("It's an Unbalanced expression");
        s.close();
	}

}
