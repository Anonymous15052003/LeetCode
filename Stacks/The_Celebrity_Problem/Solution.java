package The_Celebrity_Problem;

import java.util.Stack;

public class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> stack = new Stack<>();
    	for (int i=0;i<n;i++){
    	    stack.push(i);
    	}
    	
    	while (stack.size()>1){
    	    int a = stack.peek();
    	    stack.pop();
    	    int b = stack.peek();
    	    stack.pop();
    	    
    	    if(M[a][b]==1){
    	        stack.push(b);
    	    }
    	    else{
    	        stack.push(a);
    	    }
    	}
    	int ele = stack.pop();
    	int count = 0;
    	for (int i = 0;i<n;i++){
    	    if (M[ele][i]==0){
    	        count++;
    	    }
    	}
    	if (count!=n){
    	    return -1;
    	}
    	
    	count = 0;
    	for (int i=0;i<n;i++){
    	    if (M[i][ele]==1){
    	        count++;
    	    }
    	}
    	if (count!=n-1){
    	    return -1;
    	}
    	
    	return ele;
    }
}