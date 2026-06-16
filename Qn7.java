import java.util.Arrays;
import java.util.Scanner;

public class Qn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] st1 = s1.toCharArray();
        char[] st2 = s2.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        s1 = Arrays.toString(st1);
        s2 = Arrays.toString(st2);
        if (s1.equals(s2))
            System.out.print("Yes");
        else
            System.out.print("No");
        sc.close();
    }
}
