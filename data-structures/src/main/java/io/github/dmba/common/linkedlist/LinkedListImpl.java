package io.github.dmba.common.linkedlist;

public class LinkedListImpl<T> implements LinkedList<T> {
    private Node<T> head;
    private int size;

    @Override
    public void add(T data) {
        if (head == null) {
            head = Node.of(data);
        } else {
            Node<T> runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = Node.of(data);
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            Node<T> runner = head;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    break;
                } else {
                    runner = runner.next;
                }
            }
            return runner.data;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            Node<T> runner = head;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    runner.prev = runner.next;
                    size--;
                } else {
                    runner = runner.next;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
