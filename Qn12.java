import java.util.*;

public class Qn12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of rows/columns (0 to exit): ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.exit(0);
        }

        int[][] table = new int[n + 1][n + 1]; // +1 for row sums and total

        // Read the table values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        // Calculate row sums
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += table[i][j];
            }
            table[i][n] = sum; // Store row sum in the last column
        }

        // Calculate column sums
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += table[i][j];
            }
            table[n][j] = sum; // Store column sum in the last row
        }

        // Calculate total sum
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += table[i][n];
        }
        table[n][n] = total;

        // Print the result
        System.out.println("\nResult:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(String.format("%3d", table[i][j]));
                if (j < n) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
