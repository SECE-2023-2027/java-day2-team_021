import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ln = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < ln; i++) {
            int num = sc.nextInt();
            lst.add(num);
        }
        int n = sc.nextInt();
        for (int num : lst) {
            if (n != num)
                System.out.print(num + " ");
        }
        sc.close();
    }
}
