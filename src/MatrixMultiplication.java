import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of matrix A
        System.out.print("Enter the number of rows in matrix A: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix A: ");
        int cols1 = scanner.nextInt();

        // Get dimensions of matrix B
        System.out.print("Enter the number of rows in matrix B: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix B: ");
        int cols2 = scanner.nextInt();

        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }

        // Get elements of matrix A
        int[][] matrixA = new int[rows1][cols1];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Get elements of matrix B
        int[][] matrixB = new int[rows2][cols2];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        int[][] matrixC = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the result
        System.out.println("The result of matrix multiplication is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}