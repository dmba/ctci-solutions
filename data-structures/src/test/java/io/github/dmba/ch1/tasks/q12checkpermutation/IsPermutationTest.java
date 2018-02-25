package io.github.dmba.ch1.tasks.q12checkpermutation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface IsPermutationTest {

    IsPermutation createPredicate(String source);

    @Test
    default void testNull() {
        // Given
        final String source = null;
        final String target = null;

        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testNullSource() {
        // Given
        final String source = null;
        final String target = "any";

        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testNullTarget() {
        // Given
        final String source = "any";
        final String target = null;

        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testEmpty() {
        // Given
        final String source = "";
        final String target = "";

        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertTrue(result);
    }

    @Test
    default void testEmptySource() {
        // Given
        final String source = "";
        final String target = "any";

        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    default void testEmptyTarget() {
        // Given
        final String source = "any";
        final String target = "";

        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertFalse(result);
    }

    @Test
    default void testDifferentLengths() {
        // Given
        final String source = "abcdefgh";
        final String target = "abcdefg";

        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertThat(result).isFalse();
    }

    @ParameterizedTest(name = "{index} ==> source={0}, target={1}")
    @CsvSource({
            "abcdefg, abcdefg",
            "abfcgde, abfcged",
            "abfdceg, abfdcge",
            "abfdecg, abfdegc",
            "abfdgce, abfdgec",
            "abfecdg, abfecgd"
    })
    default void testPermutation(String source, String target) {
        // When
        final boolean result = createPredicate(source).test(target);

        // Then
        assertThat(result).isTrue();
    }

}
