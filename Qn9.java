public class Qn9 {
    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        
        System.out.println("Original Array: " + arrayToString(array));
        rotateLeft(array);
        System.out.println("Rotated Array: " + arrayToString(array));
    }
    
    public static void rotateLeft(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        
        // Store the first element
        int temp = array[0];
        
        // Shift all elements to the left by one position
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        
        // Move the first element to the end
        array[array.length - 1] = temp;
    }
    
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
