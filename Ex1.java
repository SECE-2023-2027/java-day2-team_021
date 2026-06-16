import java.util.*;

public class Ex1 {
    // field variables
    int a1;
    float a2;
    String a3;

    /*
     * // illegal field names
     * int 1a;
     * float a-2;
     * String a 3;
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex1 ex1 = new Ex1();
        System.out.print(ex1.a1 + " " + ex1.a2 + " " + ex1.a3);

        sc.close();
    }
}