package Group_Anagrams;

import java.util.*;

public class solution {
    public static List<List<String>> groupAnagrams(String [] s){
        Map<String,List<String>> map = new HashMap<>();
        for (String i : s){
            char [] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if (!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());
            }
            map.get(sorted).add(i);
        }
        return new LinkedList<>(map.values());
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
