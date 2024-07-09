package Group_Anagrams;

import java.util.*;

public class sol {
    public static List<List<String>> groupAnagrams(String [] s){
        Map<String,List<String>> hash = new HashMap<>();

        for (String i : s){
            char [] charArr = i.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if (!hash.containsKey(sorted)){
                hash.put(sorted,new LinkedList<String>());
            }
            hash.get(sorted).add(i);
        }
        return new LinkedList<>(hash.values());
    }
    public static void main(String[] args) {
        String [] s = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(s); 
        System.out.print("[");
        for (List<String> group : ans) {
            System.out.print("[");
            for (String str : group) {
                System.out.print(str + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
}
