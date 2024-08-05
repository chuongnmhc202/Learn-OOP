package Lab03;

public class Ex2 {
	public static int[][] addMatrices(int[][] matrix1,int[][] matrix2){
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int[][] result = new int[rows][cols];
		
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				result[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		return result;
	}
	
    public static int[][] multiplyMatrixWithNumber(int[][] matrix, int number) {
    	int rows = matrix.length;
    	int cols = matrix[0].length;
    	int[][] result = new int[rows][cols];
    	
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			result[i][j] = matrix[i][j] * number;
    		}
    	}
    	return result;
    }
    
    public static void printMatrix(int[][] matrix) {
    	int rows = matrix.length;
    	int cols = matrix[0].length;
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			System.out.print(matrix[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
    public static void main(String[] args) {
		int[][] matrix1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] matrix2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);
        
        // Add matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("\nSum of Matrix 1 and Matrix 2:");
        printMatrix(sumMatrix);

        // Multiply matrix with a number
        int multiplier = 10;
        int[][] multipliedMatrix = multiplyMatrixWithNumber(matrix1, multiplier);
        System.out.println("\nMatrix 1 multiplied by " + multiplier + ":");
        printMatrix(multipliedMatrix);
		
	}

}
