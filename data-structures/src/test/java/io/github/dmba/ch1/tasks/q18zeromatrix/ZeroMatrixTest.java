package io.github.dmba.ch1.tasks.q18zeromatrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public interface ZeroMatrixTest {

    ZeroMatrix createZeroMatrix();

    @Test
    default void testNull() {
        // Given
        final int[][] matrix = null;

        // When
        final int[][] zeroedMatrix = createZeroMatrix().zeroMatrix(matrix);

        // Then
        assertThat(zeroedMatrix).isNull();
    }

    @Test
    default void testEmpty() {
        // Given
        final int[][] matrix = new int[][]{
        };

        // When
        final int[][] zeroedMatrix = createZeroMatrix().zeroMatrix(matrix);

        // Then
        assertThat(zeroedMatrix).isNull();
    }

    @Test
    default void testZero1x1() {
        // Given
        final int[][] matrix = new int[][]{
                {0}
        };
        final int[][] expectedMatrix = new int[][]{
                {0}
        };

        // When
        final int[][] zeroedMatrix = createZeroMatrix().zeroMatrix(matrix);

        // Then
        assertThat(zeroedMatrix).isEqualTo(expectedMatrix);
    }

    @Test
    default void testZero2x2() {
        // Given
        final int[][] matrix = new int[][]{
                {11, 12},
                {21, 0}
        };
        final int[][] expectedMatrix = new int[][]{
                {11, 0},
                {0, 0}
        };

        // When
        final int[][] zeroedMatrix = createZeroMatrix().zeroMatrix(matrix);

        // Then
        assertThat(zeroedMatrix).isEqualTo(expectedMatrix);
    }

    @Test
    default void testZero3x2() {
        // Given
        final int[][] matrix = new int[][]{
                {11, 12},
                {0, 22},
                {31, 32}
        };
        final int[][] expectedMatrix = new int[][]{
                {0, 12},
                {0, 0},
                {0, 32}
        };

        // When
        final int[][] zeroedMatrix = createZeroMatrix().zeroMatrix(matrix);

        // Then
        assertThat(zeroedMatrix).isEqualTo(expectedMatrix);
    }

    @Test
    default void testZero4x4() {
        // Given
        final int[][] matrix = new int[][]{
                {11, 12, 13, 14},
                {21, 0, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        final int[][] expectedMatrix = new int[][]{
                {11, 0, 13, 14},
                {0, 0, 0, 0},
                {31, 0, 33, 34},
                {41, 0, 43, 44}
        };

        // When
        final int[][] zeroedMatrix = createZeroMatrix().zeroMatrix(matrix);

        // Then
        assertThat(zeroedMatrix).isEqualTo(expectedMatrix);
    }

    @Test
    default void testZero4x4NoZero() {
        // Given
        final int[][] matrix = new int[][]{
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        final int[][] expectedMatrix = new int[][]{
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };

        // When
        final int[][] zeroedMatrix = createZeroMatrix().zeroMatrix(matrix);

        // Then
        assertThat(zeroedMatrix).isEqualTo(expectedMatrix);
    }

}
