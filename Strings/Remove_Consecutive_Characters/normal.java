package Remove_Consecutive_Characters;

public class normal {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char i : s.toCharArray()){
            if (sb.length()>0 && sb.charAt(sb.length()-1)==i){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abbaca";
        String ans = removeDuplicates(s);
        System.out.println(ans);
    }
}
