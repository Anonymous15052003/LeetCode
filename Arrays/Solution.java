import java.util.Scanner;

public class Solution {

    public static int[] largestLand(int[][] houses) {
        int rows = houses.length;
        int cols = houses[0].length;

        if (rows == 0 || cols == 0) {
            return null; // Handle empty matrix case
        }

        // Use Depth-First Search (DFS) to explore connected land regions
        int maxLandSize = 0;
        int[] maxLand = null; // Initialize to avoid null pointer exceptions

        boolean[][] visited = new boolean[rows][cols]; // Track visited cells

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) { // Explore unvisited cells
                    int landSize = dfs(houses, visited, i, j);
                    if (landSize > maxLandSize) {
                        maxLandSize = landSize;
                        maxLand = new int[]{i, j, landSize}; // Store coordinates and size
                    }
                }
            }
        }

        return maxLand; // Return details of the largest land region
    }

    private static int dfs(int[][] houses, boolean[][] visited, int row, int col) {
        int rows = houses.length;
        int cols = houses[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || houses[row][col] == 0) {
            return 0; // Base cases: out of bounds, visited, or water
        }

        visited[row][col] = true; // Mark cell as visited

        int landSize = 1; // Count current cell
        landSize += dfs(houses, visited, row - 1, col); // Up
        landSize += dfs(houses, visited, row + 1, col); // Down
        landSize += dfs(houses, visited, row, col - 1); // Left
        landSize += dfs(houses, visited, row, col + 1); // Right

        return landSize;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for houses (corrected indentation)
        System.out.print("Enter the number of rows: ");
        int houses_row = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int houses_col = in.nextInt();

        int[][] houses = new int[houses_row][houses_col];
        for (int i = 0; i < houses_row; i++) {
            for (int j = 0; j < houses_col; j++) {
                houses[i][j] = in.nextInt();
            }
        }

        int[] result = largestLand(houses);

        if (result == null) {
            System.out.println("Empty matrix. No land found.");
        } else {
            System.out.println("Largest land: ");
            System.out.println("  - Coordinates: (" + result[0] + "," + result[1] + ")");
            System.out.println("  - Size: " + result[2]);
        }
    }
}
