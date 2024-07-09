package FirstNonRepeating;
import java.util.*;

public class hashi {
    public static int firstNonRepeating(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();

        for (char i : s.toCharArray()) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hash.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "aaviiddu";
        int ans = firstNonRepeating(s);
        System.out.println(ans);
    }
}
