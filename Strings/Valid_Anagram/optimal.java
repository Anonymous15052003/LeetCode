package Valid_Anagram;

public class optimal {
    public static Boolean isSame(String s, String t){
        int [] ans = new int [26];

        for (char i : s.toCharArray()){
            ans[i-'a']++;
        }

        for (char j : t.toCharArray()){
            ans[j-'a']--;
        }

        for (int k : ans){
            if (k!=0){
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
