package Repeat_and_Missing_Number_Array;

public class test {
    public static int [] findMissingRepeatingNumbers(int [] arr){
        int n = arr.length;
        int [] heap = new int [n+1];

        for (int i=0;i<n;i++){
            heap[arr[i]]++;
        }

        int repeating = -1;
        int missing = -1;

        for (int i=1;i<=n;i++){
            if (heap[i]>=2)repeating=i;
            if (heap[i]==0)missing=i;
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
