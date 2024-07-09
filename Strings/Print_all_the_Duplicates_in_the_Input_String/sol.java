package Print_all_the_Duplicates_in_the_Input_String;

import java.util.TreeSet;

public class sol {
    public static String removeDuplicateLetters(String s) {
        TreeSet<Character> tree = new TreeSet<>();
        StringBuilder a = new StringBuilder();
        for (char i : s.toCharArray()){
            if (!tree.contains(i)){
                tree.add(i);
            }
        }
        for (char c : tree){
            a.append(c);
        }
        return a.toString();
    }
    public static void main(String[] args) {
        String s = "cbacdcbc";
        String ans = removeDuplicateLetters(s);
        System.out.println(ans);
    }
}
