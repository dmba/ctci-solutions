package io.github.dmba.linkedlist;

import io.github.dmba.common.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static io.github.dmba.linkedlist.NodeChainAssert.assertThatNode;
import static io.github.dmba.linkedlist.NodeTestHelper.chainNodes;

public class NodeTest {
    @Test
    public void testCreate() {
        // Given
        // When
        final Node<String> node = Node.of("A");

        // Then
        assertThatNode(node)
                .isNotNull()
                .isHeadOfSequence("A");
    }

    @Test
    public void testAppendHead() {
        // Given
        final Node<String> head = null;

        // When
        final Node<String> newHead = Node.appendToTail(head, "A");

        // Then
        assertThatNode(newHead)
                .isNotNull()
                .isHeadOfSequence("A");
    }

    @Test
    public void testAppend() {
        // Given
        final Node<String> head = Node.of("A");

        // When
        Node.appendToTail(head, "B");
        final Node<String> newHead = Node.appendToTail(head, "C");

        // Then
        assertThatNode(newHead)
                .isNotNull()
                .isHeadOfSequence("A", "B", "C");
    }

    @Test
    public void testRemove() {
        // Given
        final Node<String> nodeA = Node.of("A");
        final Node<String> nodeB = Node.of("B");
        final Node<String> nodeC = Node.of("C");
        final Node<String> head = chainNodes(nodeA, nodeB, nodeC);

        // When
        final Node<String> newHead = Node.removeNode(head, nodeB);

        // Then
        assertThatNode(newHead)
                .isNotNull()
                .isHeadOfSequence("A", "C");
    }

    @Test
    public void testRemoveHead() {
        // Given
        final Node<String> nodeA = Node.of("A");
        final Node<String> nodeB = Node.of("B");
        final Node<String> nodeC = Node.of("C");
        final Node<String> head = chainNodes(nodeA, nodeB, nodeC);

        // When
        final Node<String> newHead = Node.removeNode(head, nodeA);

        // Then
        assertThatNode(newHead)
                .isNotNull()
                .isHeadOfSequence("B", "C");
    }

    @Test
    public void testRemoveTail() {
        // Given
        final Node<String> nodeA = Node.of("A");
        final Node<String> nodeB = Node.of("B");
        final Node<String> nodeC = Node.of("C");
        final Node<String> head = chainNodes(nodeA, nodeB, nodeC);

        // When
        final Node<String> newHead = Node.removeNode(head, nodeC);

        // Then
        assertThatNode(newHead)
                .isNotNull()
                .isHeadOfSequence("A", "B");
    }
}
