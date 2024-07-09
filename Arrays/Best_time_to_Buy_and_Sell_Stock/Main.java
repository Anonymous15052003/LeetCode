import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Example value for n
        Vector<Vector<Long>> dp = new Vector<>(n);

        // Initializing each element of the outer Vector
        for (int i = 0; i < n; i++) {
            dp.add(new Vector<>());
        }

        // Example of adding elements to the inner Vectors
        dp.get(0).add(1L);
        dp.get(1).add(2L);
        dp.get(2).add(3L);

        // Printing the dp Vector of Vectors
        for (int i = 0; i < dp.size(); i++) {
            System.out.println("Vector " + i + ": " + dp.get(i));
        }
    }
}
