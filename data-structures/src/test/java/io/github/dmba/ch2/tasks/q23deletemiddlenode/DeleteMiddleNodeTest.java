package io.github.dmba.ch2.tasks.q23deletemiddlenode;

import io.github.dmba.common.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static io.github.dmba.linkedlist.NodeChainAssert.assertThatNode;
import static io.github.dmba.linkedlist.NodeTestHelper.chainNodes;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public interface DeleteMiddleNodeTest {
    DeleteMiddleNode<String> createImpl();

    @Test
    default void testNull() {
        // Given
        // When
        final Throwable throwable = catchThrowable(() -> createImpl().deleteMiddleNode(null));

        // Then
        assertThat(throwable).isNull();
    }

    @Test
    default void testOneElement() {
        // Given
        final Node<String> head = chainNodes("A");

        // When
        createImpl().deleteMiddleNode(head);

        // Then
        assertThatNode(head).hasData("A");
    }

    @Test
    default void testTwoElements() {
        // Given
        final Node<String> head = chainNodes("A", "B");

        // When
        createImpl().deleteMiddleNode(head);

        // Then
        assertThatNode(head)
                .isNotNull()
                .isHeadOfSequence("A", "B");
    }

    @Test
    default void testRemoveMiddleInOddSizedList() {
        // Given
        final Node<String> head = chainNodes("A", "B", "C", "D", "E");

        // When
        createImpl().deleteMiddleNode(head);

        // Then
        assertThatNode(head)
                .isNotNull()
                .isHeadOfSequence("A", "B", "D", "E");
    }

    @Test
    default void testRemoveMiddleInEvenSizedList() {
        // Given
        final Node<String> head = chainNodes("A", "B", "C", "D");

        // When
        createImpl().deleteMiddleNode(head);

        // Then
        assertThatNode(head)
                .isNotNull()
                .isHeadOfSequence("A", "B", "D");
    }

}
