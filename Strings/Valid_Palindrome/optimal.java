public class optimal {
    public static Boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
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
