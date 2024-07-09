package Repeat_and_Missing_Number_Array;

public class bruteforce {
    public static int [] findMissingRepeatingNumbers(int [] arr){
        int repeating = -1;
        int missing = -1;

        for (int i=1;i<=arr.length;i++){
            int cnt=0;
            for (int j=0;j<arr.length;j++){
                if (arr[j]==i)cnt++;
            }
            if (cnt==2){
                repeating=i;
            }
            if (cnt==0){
                missing=i;
            }
        }
        int [] ans = {repeating,missing};
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }
}
