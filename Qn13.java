import java.util.*;

public class Qn13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the string: ");
        String input = scanner.nextLine();

        System.out.println(
                "The compressed string along with the counts of repeated characters is: " + exchangeStrings(input));

        scanner.close();
    }

    public static String exchangeStrings(String input) {
        StringBuilder result = new StringBuilder();

        // First, replace "python" with a placeholder to avoid conflicts
        String temp = input.replace("python", "\u0000PYTHON\u0000");

        // Then replace "java" with "python"
        temp = temp.replace("java", "python");

        // Finally replace the placeholder with "java"
        temp = temp.replace("\u0000PYTHON\u0000", "java");

        return temp;
    }
}
