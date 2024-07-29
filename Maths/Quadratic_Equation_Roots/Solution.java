package Quadratic_Equation_Roots;

import java.util.*;

public class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<Integer>();
        
        int root1 = 0, root2 = 0;
        
        int temp = (int)(Math.pow(b, 2) - 4 * a * c);

        if (temp < 0)
            roots.add(-1);
        else {
            root1 = (int)Math.floor((-1 * b + Math.sqrt(temp)) / (2 * a));
            root2 = (int)Math.floor((-1 * b - Math.sqrt(temp)) / (2 * a));
    
            roots.add(Math.max(root1, root2));
            roots.add(Math.min(root1, root2));
        }
        return roots;
    }
}