package FirstNonRepeating;
import java.util.*;

public class findd {
    public static char firstNonRepeating(String s){
        HashMap<Character,Integer> hash = new HashMap<>();

        for (char i : s.toCharArray()){
            hash.put(i,hash.getOrDefault(i, 0)+1);
        }

        for (char i : s.toCharArray()){
            if (hash.get(i)==1){
                return i;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String s = "aaviiddu";
        char ans = firstNonRepeating(s);
        System.out.println(ans);
    }
}