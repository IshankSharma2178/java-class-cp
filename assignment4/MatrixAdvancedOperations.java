public class MatrixAdvancedOperations {
    
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // Random numbers 0-9
            }
        }
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix, String name) {
        System.out.println(name + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }
    
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    public static int determinant3x3(int[][] matrix) {
        int det = 0;
        det += matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        det -= matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        det += matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }
    
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is not invertible (determinant = 0)");
            return null;
        }
        
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        
        return inverse;
    }
    
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is not invertible (determinant = 0)");
            return null;
        }
        
        double[][] inverse = new double[3][3];
        
        // Calculate cofactor matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int minorRow = 0, minorCol = 0;
                
                for (int row = 0; row < 3; row++) {
                    if (row == i) continue;
                    minorCol = 0;
                    for (int col = 0; col < 3; col++) {
                        if (col == j) continue;
                        minor[minorRow][minorCol] = matrix[row][col];
                        minorCol++;
                    }
                    minorRow++;
                }
                
                int cofactor = determinant2x2(minor);
                if ((i + j) % 2 == 1) cofactor = -cofactor;
                inverse[j][i] = cofactor / (double) det; // Note: transpose here
            }
        }
        
        return inverse;
    }
    
    public static void displayDoubleMatrix(double[][] matrix, String name) {
        System.out.println(name + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Advanced Matrix Operations Calculator");
        System.out.println("====================================");
        
        // Test 2x2 matrix operations
        System.out.println("2x2 Matrix Operations:");
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        displayMatrix(matrix2x2, "Original 2x2 Matrix");
        
        int[][] transpose2x2 = transposeMatrix(matrix2x2);
        displayMatrix(transpose2x2, "Transpose");
        
        int det2x2 = determinant2x2(matrix2x2);
        System.out.println("Determinant: " + det2x2);
        
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        if (inverse2x2 != null) {
            displayDoubleMatrix(inverse2x2, "Inverse");
        }
        
        // Test 3x3 matrix operations
        System.out.println("\n3x3 Matrix Operations:");
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        displayMatrix(matrix3x3, "Original 3x3 Matrix");
        
        int[][] transpose3x3 = transposeMatrix(matrix3x3);
        displayMatrix(transpose3x3, "Transpose");
        
        int det3x3 = determinant3x3(matrix3x3);
        System.out.println("Determinant: " + det3x3);
        
        double[][] inverse3x3 = inverse3x3(matrix3x3);
        if (inverse3x3 != null) {
            displayDoubleMatrix(inverse3x3, "Inverse");
        }
    }
}
