public class Qn10 {
    public static void main(String[] args) {
        int[] array = {50, -20, 0, 30, 40, 60, 10};
        
        System.out.println("Test Data: array = " + arrayToString(array));
        System.out.println("Sample Output: " + testFirstAndLast(array));
    }
    
    public static boolean testFirstAndLast(int[] array) {
        if (array == null || array.length < 2) {
            return false;
        }
        
        return array[0] == array[array.length - 1];
    }
    
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
