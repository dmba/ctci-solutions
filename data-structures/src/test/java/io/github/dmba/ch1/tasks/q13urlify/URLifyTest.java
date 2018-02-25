package io.github.dmba.ch1.tasks.q13urlify;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public interface URLifyTest {

    URLify createURLify();

    @Test
    default void testNull() {
        // Given
        final String text = null;
        final int charsCount = 0;

        // When
        final String urlified = createURLify().urlify(text, charsCount);

        // Then
        assertThat(urlified).isNull();
    }

    @Test
    default void testWrongCharsCount() {
        // Given
        final String text = "abc";
        final int charsCount = 13;

        // When
        final String urlified = createURLify().urlify(text, charsCount);

        // Then
        assertThat(urlified).isNull();
    }

    @Test
    default void testEmpty() {
        // Given
        final String text = "";
        final int charsCount = 0;

        // When
        final String urlified = createURLify().urlify(text, charsCount);

        // Then
        assertThat(urlified).isEmpty();
    }

    @Test
    default void testUrlify() {
        // Given
        final String text = "Mr John Smith    ";
        final int charsCount = 13;

        // When
        final String urlified = createURLify().urlify(text, charsCount);

        // Then
        assertThat(urlified).isEqualTo("Mr%20John%20Smith");
    }

}
