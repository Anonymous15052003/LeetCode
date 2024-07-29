package Convert_a_Sentence_into_its_Equivalent_Mobile_Numeric_Keypad_Sequence;
import java.util.Scanner;

public class MatrixIncorrectOrderPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and columns
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
       
        // Read the matrix
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
       
        // Calculate the total number of pairs in incorrect order
        int totalIncorrectPairs = 0;
        for (int i = 0; i < rows; i++) {
            totalIncorrectPairs += countIncorrectPairs(matrix[i]);
        }
       
        // Print the result
        System.out.println(totalIncorrectPairs);
    }

    private static int countIncorrectPairs(int[] row) {
        int count = 0;
        int length = row.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (row[i] > row[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}