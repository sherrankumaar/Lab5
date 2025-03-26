public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int diagonalSum = 0;

        for (int i = 0; i < 10; i++) {
            matrix[i][i] = i;
            diagonalSum += i;
        }
        System.out.println("Matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}
