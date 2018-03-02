package io.github.dmba.common.linkedlist;

public interface LinkedList<T> extends Iterable<T> {
    void add(T data);

    T get(int index);

    void remove(int index);

    Node<T> getHead();

    int size();
}
