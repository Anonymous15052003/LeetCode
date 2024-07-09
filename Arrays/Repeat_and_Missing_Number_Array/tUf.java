package Repeat_and_Missing_Number_Array;

public class tUf {

    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length; // size of the array
        int[] hash = new int[n + 1]; // hash array

        //update the hash array:
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        return hash;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans + "}");
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}



