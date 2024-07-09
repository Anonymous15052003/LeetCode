package Palindromic_Substrings;

public class solution {
    public static int answer(String s){
        int res = 0;
        for (int i = 0;i < s.length();i++){
            // Odd length cases
            int l = i;
            int r = i;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                res++;
            }

            //Even length cases
            l = i;
            r = i+1;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abc";
        int ans = answer(s);
        System.out.println(ans);
    }
}
