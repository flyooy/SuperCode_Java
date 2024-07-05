public class Spirale {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        spiralform(matrix);
    }

    public static int[][] spiralform(int[][] matrix) {

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; ++i) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            
            for (int i = top; i <= bottom; ++i) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
                   
            
        }
        return matrix;
    }
}

