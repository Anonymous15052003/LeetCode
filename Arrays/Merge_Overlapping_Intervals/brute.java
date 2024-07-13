package Merge_Overlapping_Intervals;

import java.util.*;

public class brute {
    public static int[][] merge(int[][] arr) {
        // Sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> l = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (!l.isEmpty() && end <= l.get(l.size() - 1)[1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }

            // Skip all the merged intervals:
            while (i < arr.length - 1 && arr[i + 1][0] <= end) {
                i++;
            }

            l.add(new int[]{start, end});
        }

        // Convert List<int[]> to int[][]
        int[][] result = new int[l.size()][2];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }

        return result;
    }
}