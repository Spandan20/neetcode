package Arrays;

public class NumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
    }
    int[][] globalMatrix;
    public NumMatrix(int[][] matrix) {
        this.globalMatrix = matrix;

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = 0;
        for (int i = row1; i<= row2; i++) {
            for (int j = col1; j<= col2; j++) {
                result += globalMatrix[i][j];
            }
        }

        return result;
    }
}
