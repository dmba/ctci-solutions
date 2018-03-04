package io.github.dmba.ch2.tasks.q22returnkthtolast;

import io.github.dmba.common.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static io.github.dmba.linkedlist.NodeChainAssert.assertThatNode;
import static io.github.dmba.linkedlist.NodeTestHelper.chainNodes;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public interface ReturnKthToLastTest {
    ReturnKthToLast<String> createReturnKthToLast();

    @Test
    default void testNull() {
        // Given
        // When
        final Node<String> node = createReturnKthToLast().findKthToLast(null, 0);

        // Then
        assertThatNode(node).isNull();
    }

    @Test
    default void testOutOfBoundsLowerBound() {
        // Given
        final Node<String> head = chainNodes("A", "B", "C");
        final int index = -1;

        // When
        final Throwable throwable = catchThrowable(() -> createReturnKthToLast().findKthToLast(head, index));

        // Then
        assertThat(throwable).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    default void testOutOfBoundsHigherBound() {
        // Given
        final Node<String> head = chainNodes("A", "B", "C");
        final int index = 4;

        // When
        final Throwable throwable = catchThrowable(() -> createReturnKthToLast().findKthToLast(head, index));

        // Then
        assertThat(throwable).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    default void testReturnAll() {
        // Given
        final Node<String> head = chainNodes("A", "B", "C", "D", "E");
        final int index = 0;

        // When
        final Node<String> node = createReturnKthToLast().findKthToLast(head, index);

        // Then
        assertThatNode(node)
                .isNotNull()
                .isHeadOfSequence("A", "B", "C", "D", "E");
    }

    @Test
    default void testReturn() {
        // Given
        final Node<String> head = chainNodes("A", "B", "C", "D", "E");
        final int index = 2;

        // When
        final Node<String> node = createReturnKthToLast().findKthToLast(head, index);

        // Then
        assertThatNode(node)
                .isNotNull()
                .isHeadOfSequence("C", "D", "E");
    }

    @Test
    default void testReturnLast() {
        // Given
        final Node<String> head = chainNodes("A", "B", "C", "D", "E");
        final int index = 4;

        // When
        final Node<String> node = createReturnKthToLast().findKthToLast(head, index);

        // Then
        assertThatNode(node)
                .isNotNull()
                .isHeadOfSequence("E");
    }
}
