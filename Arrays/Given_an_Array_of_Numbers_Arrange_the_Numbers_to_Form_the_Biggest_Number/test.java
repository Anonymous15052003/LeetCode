package Given_an_Array_of_Numbers_Arrange_the_Numbers_to_Form_the_Biggest_Number;

import java.util.*;
public class test {
    public static String largestNumber(String [] arr){
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String X, String Y){
                return (Y+X).compareTo(X+Y);
            }
        });

        if (arr[0]=="0"){
            return "0";
        }

        StringBuilder a = new StringBuilder();

        for (String num : arr){
            a.append(num);  
        }
        return a.toString();
    }
    public static void main(String[] args) {
        String[] arr1 = { "3", "30", "34", "5", "9" };
        System.out.println(largestNumber(arr1)); // Output: "9534330"

        String[] arr2 = { "54", "546", "548", "60" };
        System.out.println(largestNumber(arr2)); // Output: "6054854654"
    }
}
