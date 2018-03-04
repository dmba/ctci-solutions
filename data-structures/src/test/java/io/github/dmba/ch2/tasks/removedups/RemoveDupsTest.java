package io.github.dmba.ch2.tasks.removedups;

import io.github.dmba.common.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static io.github.dmba.linkedlist.NodeChainAssert.assertThatNode;
import static io.github.dmba.linkedlist.NodeTestHelper.chainNodes;

public interface RemoveDupsTest {
    RemoveDups<String> createRemoveDups();

    @Test
    default void testNull() {
        // Given
        // When
        createRemoveDups().removeDups(null);

        // Then
        assertThatNode(null).isNull();
    }

    @Test
    default void testEmpty() {
        // Given
        Node<String> head = chainNodes();

        // When
        createRemoveDups().removeDups(head);

        // Then
        assertThatNode(head).isNull();
    }

    @Test
    default void testRemoveDups() {
        // Given
        Node<String> head = chainNodes(
                "A",
                "B",
                "A",
                "C",
                "C",
                "D",
                "A",
                "C",
                "E",
                "F",
                "E",
                "A",
                "C");

        // When
        createRemoveDups().removeDups(head);

        // Then
        assertThatNode(head)
                .isNotNull()
                .isHeadOfSequence("A", "B", "C", "D", "E", "F");
    }

    @Test
    default void testRemoveDupsNoDups() {
        // Given
        Node<String> head = chainNodes(
                "A",
                "B",
                "C",
                "D",
                "E",
                "F");

        // When
        createRemoveDups().removeDups(head);

        // Then
        assertThatNode(head)
                .isNotNull()
                .isHeadOfSequence("A", "B", "C", "D", "E", "F");
    }
}
