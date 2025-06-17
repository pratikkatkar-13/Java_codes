public class MatrixMultiplication {
    public static void main(String[] args) {
        // Matrix A: 2x3
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Matrix B: 3x2
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Result Matrix C: 2x2
        int[][] C = new int[2][2];

        // Multiply A x B = C
        for (int i = 0; i < 2; i++) { // Rows of A
            for (int j = 0; j < 2; j++) { // Columns of B
                for (int k = 0; k < 3; k++) { // Columns of A / Rows of B
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Result of Matrix Multiplication:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
