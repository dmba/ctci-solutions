package io.github.dmba.ch1.tasks.q19stringrotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public interface StringRotationTest {

    StringRotation createZeroString();

    @Test
    default void testBothNull() {
        // Given
        final String original = null;
        final String sample = null;

        // When
        final boolean isRotation = createZeroString().isRotation(original, sample);

        // Then
        assertThat(isRotation).isFalse();
    }

    @Test
    default void testOriginalNull() {
        // Given
        final String original = null;
        final String sample = "abc";

        // When
        final boolean isRotation = createZeroString().isRotation(original, sample);

        // Then
        assertThat(isRotation).isFalse();
    }

    @Test
    default void testSampleNull() {
        // Given
        final String original = "abc";
        final String sample = null;

        // When
        final boolean isRotation = createZeroString().isRotation(original, sample);

        // Then
        assertThat(isRotation).isFalse();
    }

    @ParameterizedTest
    @CsvSource({
            "waterbottle, erbottlewat",
            "xy, yx",
    })
    default void testRotationTrue(String original, String sample) {
        // When
        final boolean isRotation = createZeroString().isRotation(original, sample);

        // Then
        assertThat(isRotation).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
            "lake, cake"
    })
    default void testRotationFalse(String original, String sample) {
        // When
        final boolean isRotation = createZeroString().isRotation(original, sample);

        // Then
        assertThat(isRotation).isFalse();
    }

}
