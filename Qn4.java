import java.util.HashMap;
import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s1.toCharArray())
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        int i = 0;
        for (char c : s1.toCharArray()) {
            if (mp.get(c) == 1) {
                System.out.print(i);
                return;
            }
            i++;
        }
        sc.close();
    }
}
