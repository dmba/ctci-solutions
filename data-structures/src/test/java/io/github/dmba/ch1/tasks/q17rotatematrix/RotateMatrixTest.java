package io.github.dmba.ch1.tasks.q17rotatematrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public interface RotateMatrixTest {

    RotateMatrix createRotator();

    @Test
    default void testNull() {
        // Given
        final int[][] matrix = null;

        // When
        final int[][] result = createRotator().rotate(matrix);

        // Then
        assertThat(result).isNull();
    }

    @Test
    default void testAsymmetricMatrix() {
        // Given
        final int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5}
        };

        // When
        final int[][] result = createRotator().rotate(matrix);

        // Then
        assertThat(result).isNull();
    }

    @Test
    default void testRotate2x2() {
        // Given
        final int[][] matrix = {
                {0, 1},
                {2, 3}
        };
        final int[][] expectedMatrix = {
                {2, 0},
                {3, 1}
        };

        // When
        final int[][] result = createRotator().rotate(matrix);

        // Then
        assertThat(result).isEqualTo(expectedMatrix);
    }

    @Test
    default void testRotate3x3() {
        // Given
        final int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        final int[][] expectedMatrix = {
                {6, 3, 0},
                {7, 4, 1},
                {8, 5, 2}
        };

        // When
        final int[][] result = createRotator().rotate(matrix);

        // Then
        assertThat(result).isEqualTo(expectedMatrix);
    }

    @Test
    default void testRotate4x4() {
        // Given
        final int[][] matrix = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        final int[][] expectedMatrix = {
                {41, 31, 21, 11},
                {42, 32, 22, 12},
                {43, 33, 23, 13},
                {44, 34, 24, 14}
        };

        // When
        final int[][] result = createRotator().rotate(matrix);

        // Then
        assertThat(result).isEqualTo(expectedMatrix);
    }

}
