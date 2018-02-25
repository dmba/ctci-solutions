package io.github.dmba.ch1.tasks.q15oneway;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface EditsVerifierTest {

    EditsVerifier createVerifier();

    @Test
    default void testNull() {
        // Given
        final String first = null;
        final String second = null;

        // When
        final boolean result = createVerifier().isAtMostOneEditAway(first, second);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testFirstNull() {
        // Given
        final String first = null;
        final String second = "any";

        // When
        final boolean result = createVerifier().isAtMostOneEditAway(first, second);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testSecondNull() {
        // Given
        final String first = "any";
        final String second = null;

        // When
        final boolean result = createVerifier().isAtMostOneEditAway(first, second);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testEmpty() {
        // Given
        final String first = "";
        final String second = "";

        // When
        final boolean result = createVerifier().isAtMostOneEditAway(first, second);

        // Then
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({
            "pale, ple",
            "pales, pale",
            "pale, bale",
    })
    default void testAtMostOneEditAwayTrue(String first, String second) {
        // When
        final boolean result = createVerifier().isAtMostOneEditAway(first, second);

        // Then
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
            "pale, bake"
    })
    default void testAtMostOneEditAwayFalse(String first, String second) {
        // When
        final boolean result = createVerifier().isAtMostOneEditAway(first, second);

        // Then
        assertThat(result).isFalse();
    }

}
