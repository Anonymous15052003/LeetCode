package Valid_Anagram;

import java.util.HashMap;

public class hashmap {
    public static Boolean isSame(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hash = new HashMap<>();

        for (char i : s.toCharArray()){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }

        for (char i : t.toCharArray()){
            if (!hash.containsKey(i) || hash.get(i)==0){
                return false;
            }
            hash.put(i,hash.get(i)-1);
        }

        for (int i : hash.values()){
            if (i!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if (isSame(s,t)){
            System.out.println("Anagram Strings");
        }
        else{
            System.out.println("Not Anagram Strings");
        }
    }
}
