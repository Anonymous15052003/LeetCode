package Find_Minimum_Number_of_Moves_to_Make_Palindrome;

public class test {
    public int minMovesToMakePalindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        int ans = 0;
        char [] strArr = str.toCharArray();

        while (i<j){
            if (strArr[i]==strArr[j]){
                i++;
                j--;
            }
            else{
                int k = j;
                k = findKthIndex(strArr,i,k);

                if (i==k){
                    swap(strArr,i);
                    ans++;
                }
                else{
                    while (k<j){
                        swap(strArr,k);
                        ans++;
                        k++;
                    }
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
    public static int findKthIndex(char [] strArr, int l, int k){
        while (l<k){
            if (strArr[l]==strArr[k]) return k;
            k--;
        }
        return k;
    }
    public static void swap(char [] strArr, int l){
        if (l+1<strArr.length){
            char temp = strArr[l];
            strArr[l] = strArr[l+1];
            strArr[l+1] = temp; 
        }
    }
}