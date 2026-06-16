import java.util.*;

public class Ex2 {
    int num;
    String s;
    double d;
    char c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex2 ex2 = new Ex2();
        System.out.print(ex2.num + " " + ex2.s + " " + ex2.d + " " + ex2.c);
        int var; // uninitialized local variable
        // System.out.print(var); -> gives compile time error
        var = 10; // initialization of local variable
        System.out.print(var);
        sc.close();
    }
}