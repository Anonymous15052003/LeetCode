package Training;

import java.util.Scanner;

public class Infixtopostfix {
	static char Stack[]=new char[50];
	static int top=-1;
		
	static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/':
        case '%':
            return 2; 
       
        case '^': 
        case '$':
            return 3; 
        } 
        return -1; 
    } 
	
	static void push(char ele) {
		Stack[++top]=ele;
	}

	static char pop() {
		if(top==-1) {
			System.out.println("Underflow");
			return '#';
		}
		else {
			return(Stack[top--]);
		}
	}
	
	
	static String infixtopostfix(String exp) {
		String result=new String();
		push('#');
		
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				result=result+c;
			}
			else if(c=='(') {
				push(c);
			}
			else if(c==')') {
				while(Stack[top]!='(') {
					result=result+pop();
				}
				pop();
			}
			else {
				while(Prec(Stack[top])>=Prec(c)) {
					result=result+pop();
				}
				push(c);
			}
		}
		
		while(Stack[top]!='#') {
			result+=pop();
		}
        
		return result;
	}
    
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the infix expression");
		String inf=s.nextLine();
		System.out.println("The infix expression is"+inf);
		
		String post=infixtopostfix(inf);
		System.out.println("The postfix expression is"+post);
		s.close();
	}
}