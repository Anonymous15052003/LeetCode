package Longest_Palindromic_Substring;

public class solution {
    public static String answer(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String ans = "";
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindromes
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > len) {
                    ans = s.substring(l, r + 1);
                    len = r - l + 1;
                }
                l--;
                r++;
            }

            // Check for even length palindromes
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > len) {
                    ans = s.substring(l, r + 1);
                    len = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "babad";
        String ans = answer(s);
        System.out.println(ans);
    }
}
