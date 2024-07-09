package Longest_Common_Prefix;

import java.util.Arrays;

public class sol {
    public static String longestCommonPrefix(String[] str) {
        StringBuilder a = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        for (int i=0;i<Math.min(first.length(),last.length());i++){
            if (first.charAt(i) != last.charAt(i)){
                return a.toString();
            }
            a.append(first.charAt(i));
        }
        return a.toString();
    }

    public static void main(String[] args) {
        String [] str = {"flower","flow","flight"};
        String ans = longestCommonPrefix(str);
        System.out.println(ans);
    }
}
