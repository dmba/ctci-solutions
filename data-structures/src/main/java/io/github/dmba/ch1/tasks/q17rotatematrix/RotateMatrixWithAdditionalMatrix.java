package io.github.dmba.ch1.tasks.q17rotatematrix;

public class RotateMatrixWithAdditionalMatrix implements RotateMatrix {
    @Override
    public int[][] rotate(int[][] matrix) {
        return matrix != null && matrix.length == matrix[0].length
                ? rotateInternal(matrix)
                : null;
    }

    private int[][] rotateInternal(int[][] matrix) {
        final int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = matrix[n - j - 1][i];
            }
        }
        return rotated;
    }
}
