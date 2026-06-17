import java.util.*;

public class Qn14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the month(1-12): ");
        int month = scanner.nextInt();

        System.out.print("Input date (1-31): ");
        int date = scanner.nextInt();

        String dayName = findDayName(month, date);
        System.out.println("Name of the date:  " + dayName);

        scanner.close();
    }

    public static String findDayName(int month, int date) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        // Number of days from Jan 1, 2004 (Thursday) to the given date
        int totalDays = 0;

        // Days in each month for 2004 (leap year)
        int[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Add days from previous months
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Add remaining days
        totalDays += date - 1;

        // January 1, 2004 was Thursday (day 4)
        int dayIndex = (4 + totalDays) % 7;

        return days[dayIndex];
    }
}
