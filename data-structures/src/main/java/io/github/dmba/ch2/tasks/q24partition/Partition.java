package io.github.dmba.ch2.tasks.q24partition;

import io.github.dmba.common.linkedlist.Node;

public interface Partition<T extends Comparable<T>> {

    void partition(Node<T> head, T pivot);

    default boolean isGreaterEquals(T one, T other) {
        return one != null && other != null && one.compareTo(other) >= 0;
    }
}
