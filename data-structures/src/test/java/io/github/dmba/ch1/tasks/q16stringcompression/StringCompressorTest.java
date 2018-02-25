package io.github.dmba.ch1.tasks.q16stringcompression;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public interface StringCompressorTest {

    StringCompressor createCompressor();

    @Test
    default void testNull() {
        // When
        final String compressed = createCompressor().compress(null);

        // Then
        assertThat(compressed).isNull();
    }

    @Test
    default void testEmpty() {
        // When
        final String compressed = createCompressor().compress("");

        // Then
        assertThat(compressed).isEmpty();
    }

    @ParameterizedTest
    @CsvSource({
            "abcdefghijk, abcdefghijk",
            "aabcccccaaa, a2b1c5a3",
            "aabb, aabb",
    })
    default void testCompression(String original, String expected) {
        // When
        final String compressed = createCompressor().compress(original);

        // Then
        assertThat(compressed).isEqualTo(expected);
    }

}
