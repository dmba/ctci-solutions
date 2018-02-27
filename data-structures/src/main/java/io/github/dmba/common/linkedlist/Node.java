package io.github.dmba.common.linkedlist;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    private Node(T data) {
        this.data = data;
    }

    static <T> Node<T> of(T data) {
        return new Node(data);
    }
}
