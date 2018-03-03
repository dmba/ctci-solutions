package io.github.dmba.common.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public interface LinkedListTest {

    LinkedList<String> getList();

    @BeforeEach
    default void beforeEach() {
        final LinkedList<String> list = getList();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    @Test
    default void testAdd() {
        // Given
        final LinkedList<String> list = getList();

        // When
        list.add("E");

        // Then
        final Node<String> head = list.getHead();

        assertThat(list.size()).isEqualTo(5);
        assertThat(head.data).isEqualTo("A");
        assertThat(head.next.data).isEqualTo("B");
        assertThat(head.next.next.data).isEqualTo("C");
        assertThat(head.next.next.next.data).isEqualTo("D");
        assertThat(head.next.next.next.next.data).isEqualTo("E");

        final Node<String> last = head.next.next.next.next;

        assertThat(last.next).isNull();
        assertThat(last.data).isEqualTo("E");
        assertThat(last.prev.data).isEqualTo("D");
        assertThat(last.prev.prev.data).isEqualTo("C");
        assertThat(last.prev.prev.prev.data).isEqualTo("B");
        assertThat(last.prev.prev.prev.prev.data).isEqualTo("A");
        assertThat(last.prev.prev.prev.prev.prev).isNull();
    }

    @Test
    default void testGet() {
        // Given
        final LinkedList<String> list = getList();

        // When
        // Then
        assertThat(list.get(0)).isEqualTo("A");
        assertThat(list.get(1)).isEqualTo("B");
        assertThat(list.get(2)).isEqualTo("C");
        assertThat(list.get(3)).isEqualTo("D");
    }

    @Test
    default void testGetOutOfBounds() {
        // Given
        final LinkedList<String> list = getList();

        // When
        final Throwable[] throwables = new Throwable[]{
                catchThrowable(() -> list.get(-3)),
                catchThrowable(() -> list.get(-2)),
                catchThrowable(() -> list.get(-1)),
                catchThrowable(() -> list.get(5)),
                catchThrowable(() -> list.get(100500))
        };

        // Then
        assertThat(throwables.length).isEqualTo(5);
        assertThat(throwables).hasOnlyElementsOfType(IndexOutOfBoundsException.class);
    }

    @Test
    default void testRemove() {
        // Given
        final LinkedList<String> list = getList();

        // When
        list.remove(1);

        // Then
        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(0)).isEqualTo("A");
        assertThat(list.get(1)).isEqualTo("C");
        assertThat(list.get(2)).isEqualTo("D");
    }

    @Test
    default void testRemoveFirst() {
        // Given
        final LinkedList<String> list = getList();

        // When
        list.remove(0);

        // Then
        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(0)).isEqualTo("B");
        assertThat(list.get(1)).isEqualTo("C");
        assertThat(list.get(2)).isEqualTo("D");
    }

    @Test
    default void testRemoveLast() {
        // Given
        final LinkedList<String> list = getList();

        // When
        list.remove(list.size() - 1);

        // Then
        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(0)).isEqualTo("A");
        assertThat(list.get(1)).isEqualTo("B");
        assertThat(list.get(2)).isEqualTo("C");
    }

    @Test
    default void testRemoveOutOfBounds() {
        // Given
        final LinkedList<String> list = getList();

        // When
        final Throwable[] throwables = new Throwable[]{
                catchThrowable(() -> list.remove(-3)),
                catchThrowable(() -> list.remove(-2)),
                catchThrowable(() -> list.remove(-1)),
                catchThrowable(() -> list.remove(5)),
                catchThrowable(() -> list.remove(100500))
        };

        // Then
        assertThat(throwables.length).isEqualTo(5);
        assertThat(throwables).hasOnlyElementsOfType(IndexOutOfBoundsException.class);
    }

    @Test
    default void testGetHead() {
        // Given
        final LinkedList<String> list = getList();

        // When
        final Node<String> head = list.getHead();

        // Then
        assertThat(head.data).isEqualTo("A");
        assertThat(head.prev).isNull();
        assertThat(head.next).isNotNull();
    }
}
