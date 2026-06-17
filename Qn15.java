import java.util.*;

public class Qn15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (you can include space as well): ");
        String input = scanner.nextLine();

        String compressed = compressString(input);
        System.out.println("The compressed string along with the counts of repeated characters is: " + compressed);

        scanner.close();
    }

    public static String compressString(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the next character is different or if we're at the end
            if (i + 1 >= input.length() || input.charAt(i + 1) != currentChar) {
                result.append(currentChar).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        return result.toString();
    }
}
