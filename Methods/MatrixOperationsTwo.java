import java.util.*;

public class MatrixOperationsTwo {
    public static double[][] generateRandomMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    public static double determinant2x2(double[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static double determinant3x3(double[][] mat) {
        return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])
                - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
                + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
    }

    // 5. Inverse of 2x2
    public static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        if (det == 0)
            return null;
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] = mat[0][0] / det;
        return inv;
    }

    // 6. Inverse of 3x3
    public static double[][] inverse3x3(double[][] mat) {
        double det = determinant3x3(mat);
        if (det == 0)
            return null;

        double[][] inv = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double[][] minor = new double[2][2];
                int m = 0;
                for (int x = 0; x < 3; x++) {
                    if (x == i)
                        continue;
                    int n = 0;
                    for (int y = 0; y < 3; y++) {
                        if (y == j)
                            continue;
                        minor[m][n++] = mat[x][y];
                    }
                    m++;
                }
                double cofactor = ((i + j) % 2 == 0 ? 1 : -1) * determinant2x2(minor);
                inv[j][i] = cofactor / det; // transpose for adjugate
            }
        }

        return inv;
    }

    // 7. Display matrix
    public static void displayMatrix(double[][] mat) {
        if (mat == null) {
            System.out.println("Matrix is null (possibly non-invertible).");
            return;
        }
        for (double[] row : mat) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose matrix size (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 supported.");
            return;
        }

        double[][] matrix = generateRandomMatrix(size, size);
        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            System.out.println("\nInverse:");
            displayMatrix(inverse2x2(matrix));
        } else {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            System.out.println("\nInverse:");
            displayMatrix(inverse3x3(matrix));
        }

        sc.close();
    }
}