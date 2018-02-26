package io.github.dmba.common.linkedlist;

public interface LinkedList<T> {
    void add(T data);

    T get(int index);

    boolean remove(int index);

    int size();
}
