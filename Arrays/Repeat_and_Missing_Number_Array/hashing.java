package Repeat_and_Missing_Number_Array;

public class hashing {
    public static int [] findMissingRepeatingNumbers(int [] arr){
        int repeating = -1;
        int missing = -1;
        int n = arr.length;

        int [] hash = new int[n+1];

        for (int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        for (int i=1;i<=n;i++){
            if (hash[i]==2) repeating=i;
            if (hash[i]==0) missing=i;
            if (repeating!=-1 && missing!=-1)break;
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
