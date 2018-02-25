package io.github.dmba.ch1.tasks.q17rotatematrix;

public class RotateMatrixNoAdditionalMatrixV2 implements RotateMatrix {
    @Override
    public int[][] rotate(int[][] matrix) {
        return matrix != null && matrix.length == matrix[0].length
                ? rotateInternal(matrix)
                : null;
    }

    private int[][] rotateInternal(int[][] matrix) {
        final int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first, j = last; i < last; i++, j--) {
                int top = matrix[first][i];
                matrix[first][i] = matrix[j][first];

                matrix[j][first] = matrix[last][j];

                matrix[last][j] = matrix[i][last];

                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}
