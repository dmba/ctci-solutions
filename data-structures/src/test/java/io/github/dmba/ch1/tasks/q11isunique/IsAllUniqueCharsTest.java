package io.github.dmba.ch1.tasks.q11isunique;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public interface IsAllUniqueCharsTest {

    IsAllUniqueChars createPredicate();

    @Test
    default void testNull() {
        // Given
        final String str = null;

        // When
        final boolean result = createPredicate().test(str);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    default void testEmpty() {
        // Given
        final String str = "";

        // When
        final boolean result = createPredicate().test(str);

        // Then
        //        assertThatNode(result).isTrue();
    }

    @Test
    default void testAllUniqueChars() {
        // Given
        final String str = "abcdefg";

        // When
        final boolean result = createPredicate().test(str);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    default void testNotAllUniqueChars() {
        // Given
        final String str = "abccdefg";

        // When
        final boolean result = createPredicate().test(str);

        // Then
        assertThat(result).isFalse();
    }

}
