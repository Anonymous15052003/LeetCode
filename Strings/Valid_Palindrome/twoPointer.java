public class twoPointer {
    public static Boolean isPalindrome(String str){
        StringBuilder a = new StringBuilder();

        for (char s : str.toCharArray()){
            if (Character.isLetterOrDigit(s)){
                a.append(s);
            }
        }
        String k = a.toString().toLowerCase();

        int i = 0;
        int j = k.length()-1;

        while (i<j){
            if (k.charAt(i)!=k.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isLetterOrDigit(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        
        if (isPalindrome(str)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome String");
        }
    }
}
