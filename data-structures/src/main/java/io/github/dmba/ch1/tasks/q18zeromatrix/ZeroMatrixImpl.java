package io.github.dmba.ch1.tasks.q18zeromatrix;

public class ZeroMatrixImpl implements ZeroMatrix {
    @Override
    public int[][] zeroMatrix(int[][] matrix) {
        return matrix != null && matrix.length > 0 ? zeroMatrixInternal(matrix) : null;
    }

    private int[][] zeroMatrixInternal(int[][] matrix) {
        boolean[] zeroedRows = new boolean[matrix[0].length];
        boolean[] zeroedCols = new boolean[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroedRows[i] = true;
                    zeroedCols[j] = true;
                }
            }
        }

        for (int i = 0; i < zeroedRows.length; i++) {
            if (zeroedRows[i]) {
                zeroRow(matrix, i);
            }
        }

        for (int i = 0; i < zeroedCols.length; i++) {
            if (zeroedCols[i]) {
                zeroColumn(matrix, i);
            }
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
