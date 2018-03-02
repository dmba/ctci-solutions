package io.github.dmba.common.linkedlist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

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
            runner.next.prev = runner;
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
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < size) {
            Node<T> runner = head;
            if (index == 0) {
                if (head.next != null) {
                    head = head.next;
                } else {
                    head = null;
                }
            } else {
                while (index-- != 0) {
                    runner = runner.next;
                }
                if (runner.prev != null) {
                    runner.prev.next = runner.next;
                }
                if (runner.next != null) {
                    runner.next.prev = runner.prev;
                }
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Node<T> getHead() {
        return head;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
