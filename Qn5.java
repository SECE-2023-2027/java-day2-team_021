import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ln = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < ln; i++) {
            int num = sc.nextInt();
            lst.add(num);
        }
        int n = sc.nextInt();
        if (n <= lst.size())
            lst.remove(lst.size() - n);
        System.out.println();
        for (int num : lst) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
