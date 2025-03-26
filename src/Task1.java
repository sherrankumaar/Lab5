public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 9 - i;
        }
        System.out.println("Array contents:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
