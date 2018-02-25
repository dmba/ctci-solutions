package io.github.dmba.ch1.tasks.q14palindromepermutation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface PalindromePermutationTest {

    PalindromePermutation createPermutationChecker();

    @Test
    default void testNull() {
        // When
        final boolean result = createPermutationChecker().isPalindromePermutation(null);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testEmpty() {
        // When
        final boolean result = createPermutationChecker().isPalindromePermutation("");

        // Then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Tact Coa",
            "carerac",
            "aabb",
            "aab"
    })
    default void testPermutationTrue(String testString) {
        // When
        final boolean result = createPermutationChecker().isPalindromePermutation(testString);

        // Then
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "aabc",
            "carer",
            "idea"
    })
    default void testPermutationFalse(String testString) {
        // When
        final boolean result = createPermutationChecker().isPalindromePermutation(testString);

        // Then
        assertThat(result).isFalse();
    }

}
