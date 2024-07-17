package Find_if_an_expression_has_duplicate_parenthesis_or_not;

import java.util.Stack;

public class GFG {
    static boolean findDuplicateParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        char[] str = s.toCharArray();
        for (char ch : str) {
            if (ch == ')') {
                int elementsInside = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    elementsInside++;
                }
                stack.pop(); // pop the opening parenthesis '('

                if (elementsInside < 1) {
                    return true; // found duplicate parenthesis
                }
            } else {
                stack.push(ch);
            }
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))";

        if (findDuplicateParenthesis(str)) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("No Duplicates Found");
        }
    }
}