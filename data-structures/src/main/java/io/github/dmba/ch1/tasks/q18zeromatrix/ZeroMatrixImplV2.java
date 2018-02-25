package io.github.dmba.ch1.tasks.q18zeromatrix;

public class ZeroMatrixImplV2 implements ZeroMatrix {
    @Override
    public int[][] zeroMatrix(int[][] matrix) {
        return matrix != null && matrix.length > 0 ? zeroMatrixInternal(matrix) : null;
    }

    private int[][] zeroMatrixInternal(int[][] matrix) {
        boolean zeroFirstRow = false;
        boolean zeroFirstCol = false;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                zeroFirstRow = true;
                break;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                zeroFirstCol = true;
                break;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                zeroRow(matrix, i);
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                zeroColumn(matrix, i);
            }
        }

        if (zeroFirstRow) {
            zeroRow(matrix, 0);
        }

        if (zeroFirstCol) {
            zeroColumn(matrix, 0);
        }

        return matrix;
    }

    private void zeroRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private void zeroColumn(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
