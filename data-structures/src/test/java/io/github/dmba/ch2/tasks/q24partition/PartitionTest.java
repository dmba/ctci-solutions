package io.github.dmba.ch2.tasks.q24partition;

import io.github.dmba.common.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static io.github.dmba.linkedlist.NodeChainAssert.assertThatNode;
import static io.github.dmba.linkedlist.NodeTestHelper.chainNodes;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public interface PartitionTest {
    Partition<Integer> createPartition();

    @Test
    default void testNullHead() {
        // Given
        final Node<Integer> head = null;
        final Integer pivot = 13;

        // When
        final Throwable throwable = catchThrowable(() -> createPartition().partition(head, pivot));

        // Then
        assertThat(throwable).isNull();
    }

    @Test
    default void testNullPivot() {
        // Given
        final Node<Integer> head = Node.of(13);
        final Integer pivot = null;

        // When
        final Throwable throwable = catchThrowable(() -> createPartition().partition(head, pivot));

        // Then
        assertThat(throwable).isNull();
    }

    @Test
    default void testPartition() {
        // Given
        final Node<Integer> head = chainNodes(3, 5, 8, 5, 10, 2, 1);
        final Integer pivot = 5;

        // When
        createPartition().partition(head, pivot);

        // Then
        assertThatNode(head).isHeadOfSequence(3, 1, 2, 10, 5, 5, 8);
    }

    @Test
    default void testIsGreaterEquals() {
        // Given
        final Partition<Integer> partition = createPartition();

        // When
        final boolean isNullGreaterThan3 = partition.isGreaterEquals(null, 3);
        final boolean is3GreaterThanNull = partition.isGreaterEquals(3, null);
        final boolean isNullGreaterThanNull = partition.isGreaterEquals(null, null);
        final boolean is3GreaterThan5 = partition.isGreaterEquals(3, 5);
        final boolean is5GreaterThan5 = partition.isGreaterEquals(5, 5);
        final boolean is5GreaterThan3 = partition.isGreaterEquals(5, 4);

        // Then
        assertThat(isNullGreaterThan3).isFalse();
        assertThat(is3GreaterThanNull).isFalse();
        assertThat(isNullGreaterThanNull).isFalse();
        assertThat(is3GreaterThan5).isFalse();
        assertThat(is5GreaterThan5).isTrue();
        assertThat(is5GreaterThan3).isTrue();
    }
}
