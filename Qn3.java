import java.util.Scanner;

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuffer stbuff = new StringBuffer();
        if (s1.length() > 1)
            stbuff.append(s1.substring(1, s1.length()));
        if (s2.length() > 1)
            stbuff.append(s2.substring(1, s2.length()));
        System.out.println(stbuff.toString());
        sc.close();
    }
}
