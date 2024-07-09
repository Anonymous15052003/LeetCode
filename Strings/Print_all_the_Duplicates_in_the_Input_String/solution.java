package Print_all_the_Duplicates_in_the_Input_String;

import java.util.*;

public class solution {
    public static void printDups(String s){
        HashMap<Character,Integer> hash = new HashMap<>();

        for (char i : s.toCharArray()){
            if (hash.containsKey(i)){
                hash.put(i,hash.getOrDefault(i, 0)+1);
            }
            else{
                hash.put(i,1);
            }
        }
        
        for (Map.Entry<Character,Integer> a : hash.entrySet()){
            if (a.getValue()>=2){
                System.out.println(a.getKey()+" is having count of "+a.getValue());
            }
        }
    }
    public static void main(String args[])
    {
        String str = "test string";
        printDups(str);
    }
}