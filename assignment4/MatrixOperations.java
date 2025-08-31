public class MatrixOperations {
    
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
    
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return result;
    }
    
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        return result;
    }
    
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Matrix Operations Calculator");
        System.out.println("============================");
        
        // Create two 3x3 matrices
        int[][] matrix1 = createRandomMatrix(3, 3);
        int[][] matrix2 = createRandomMatrix(3, 3);
        
        System.out.println("Generated Matrices:");
        displayMatrix(matrix1, "Matrix A");
        displayMatrix(matrix2, "Matrix B");
        
        // Matrix Addition
        System.out.println("Matrix Addition (A + B):");
        int[][] addition = addMatrices(matrix1, matrix2);
        displayMatrix(addition, "Result");
        
        // Matrix Subtraction
        System.out.println("Matrix Subtraction (A - B):");
        int[][] subtraction = subtractMatrices(matrix1, matrix2);
        displayMatrix(subtraction, "Result");
        
        // Matrix Multiplication
        System.out.println("Matrix Multiplication (A × B):");
        int[][] multiplication = multiplyMatrices(matrix1, matrix2);
        displayMatrix(multiplication, "Result");
        
        // Test with different dimensions for multiplication
        System.out.println("Testing with different dimensions:");
        int[][] matrix3 = createRandomMatrix(2, 3);
        int[][] matrix4 = createRandomMatrix(3, 2);
        
        displayMatrix(matrix3, "Matrix C (2×3)");
        displayMatrix(matrix4, "Matrix D (3×2)");
        
        System.out.println("Matrix Multiplication (C × D):");
        int[][] multiplication2 = multiplyMatrices(matrix3, matrix4);
        displayMatrix(multiplication2, "Result (2×2)");
    }
}
