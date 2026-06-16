import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int hr = sec / 3600;
        int min = (sec % 3600) / 60;
        int s = sec % 60;

        System.out.print(hr + ":" + min + ":" + s);
        scanner.close();
    }
}
