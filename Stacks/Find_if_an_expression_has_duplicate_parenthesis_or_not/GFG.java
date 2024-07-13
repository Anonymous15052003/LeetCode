package Find_if_an_expression_has_duplicate_parenthesis_or_not;

import java.util.Stack;

public class GFG {
	static boolean findDuplicateparenthesis(String s) {
		Stack<Character> Stack = new Stack<>();

		char[] str = s.toCharArray();
		for (char ch : str) {
			if (ch == ')') {
				char top = Stack.peek();
				Stack.pop();

				// stores the number of characters between a closing and opening parenthesis 
				// if this count is less than or equal to 1 then the brackets are redundant else not 
				int elementsInside = 0;
				while (top != '(') {
					elementsInside++;
				}
				if (elementsInside < 1) {
					return true;
				}
			} // push open parenthesis '(', operators and 
			// operands to stack 
			else {
				Stack.push(ch);
			}
		}

		// No duplicates found 
		return false;
	}

// Driver code 
public static void main(String[] args) {

		// input balanced expression 
		String str = "(((a+(b))+(c+d)))";

		if (findDuplicateparenthesis(str)) {
			System.out.println("Duplicate Found ");
		} else {
			System.out.println("No Duplicates Found ");
		}

	}
}
