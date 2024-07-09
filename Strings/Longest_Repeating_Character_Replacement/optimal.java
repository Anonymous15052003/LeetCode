package Longest_Repeating_Character_Replacement;

public class optimal {
    public static int answer(String s, int k){
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int maxfreq = 0;

        int[] hash = new int[26];

        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq, hash[s.charAt(r) - 'A']);

            if ((r - l + 1) - maxfreq > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "AAABBCCD";
        int k = 2;
        int ans = answer(s, k);
        System.out.println(ans);
    }
}
