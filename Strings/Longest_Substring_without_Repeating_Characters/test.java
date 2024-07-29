import java.util.HashMap;
public class test {
    public static int solve(String s){
        HashMap<Character,Integer> mpp = new HashMap<>();

        int left = 0;
        int right = 0;
        int len = Integer.MIN_VALUE;

        while (right<s.length()){
            if (mpp.containsKey(s.charAt(right))){
                left = Math.max(left,mpp.get(s.charAt(right))+1);
            }
            mpp.put(s.charAt(right),right);
            len = Math.max(right - left + 1, len);
            right++;
        }
        return len;
    }
    public static void main(String args[]) {
        String str = "takeUforward";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }
}
