package io.github.dmba.common.linkedlist;

public class Node<T> {
    public final T data;
    public Node<T> next;

    private Node(T data) {
        this.data = data;
    }

    public static <T> Node<T> appendToTail(Node<T> head, T data) {
        final Node<T> node = Node.of(data);

        if (head == null) {
            return node;
        }

        Node<T> cursor = head;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor.next = node;

        return head;
    }

    public static <T> Node<T> removeNode(Node<T> head, Node<T> node) {
        Node<T> cursor = head;

        if (cursor == node) {
            return head.next;
        }

        while (cursor.next != null) {
            if (cursor.next == node) {
                cursor.next = cursor.next.next;
                break;
            }
            cursor = cursor.next;
        }

        return head;
    }

    public static <T> Node<T> of(T data) {
        return new Node<>(data);
    }

}
