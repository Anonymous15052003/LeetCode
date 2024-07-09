package Given_an_Array_of_Numbers_Arrange_the_Numbers_to_Form_the_Biggest_Number;

import java.util.*;

public class LargestNumber {

    public static String largestNumber(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String X, String Y) {
                return (Y + X).compareTo(X + Y);
            }
        });

        // Handle the case where all numbers are zero
        if (arr[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted array
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] arr1 = { "3", "30", "34", "5", "9" };
        System.out.println(largestNumber(arr1)); // Output: "9534330"

        String[] arr2 = { "54", "546", "548", "60" };
        System.out.println(largestNumber(arr2)); // Output: "6054854654"
    }
}
