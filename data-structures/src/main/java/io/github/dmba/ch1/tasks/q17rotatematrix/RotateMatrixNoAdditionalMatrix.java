package io.github.dmba.ch1.tasks.q17rotatematrix;

public class RotateMatrixNoAdditionalMatrix implements RotateMatrix {
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
            for (int i = first; i < last; i++) {
                int top = matrix[first][i];
                int offset = i - first;

                matrix[first][i] = matrix[last - offset][first];

                matrix[last - offset][first] = matrix[last][last - offset];

                matrix[last][last - offset] = matrix[i][last];

                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}
