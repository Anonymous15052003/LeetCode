package Get_minimum_element_from_stack;

import java.util.Stack;

public class GFG
{
    int minEle;
    Stack<Integer> stk;
    Stack<Integer> minStk;
    
    // Constructor    
    GFG()
	{
        stk=new Stack<>();
        minStk=new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	    // Your code here
	    if (minStk.isEmpty()){
	        return -1;
	    }
	    return minStk.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	    // Your code here
	    if (stk.isEmpty()){
	        return -1;
	    }
	    
        int ele = stk.peek();
        stk.pop();
        if (ele==minStk.peek()){
            minStk.pop();
        }
        return ele;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	    // Your code here	
	    stk.push(x);
	    if (minStk.isEmpty() || x<=minStk.peek()){
	        minStk.push(x);
	    }
    }	
}