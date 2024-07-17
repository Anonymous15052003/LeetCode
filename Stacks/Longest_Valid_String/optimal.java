package Longest_Valid_String;

public class optimal {
    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int maxi = 0;

        // First pass: left to right
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxi = Math.max(maxi, left * 2);
            } else if (right > left) {
                left = 0;
                right = 0;
            }
        }

        left = 0;
        right = 0;

        // Second pass: right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxi = Math.max(maxi, left * 2);
            } else if (left > right) {
                left = 0;
                right = 0;
            }
        }

        return maxi;
    }
}
