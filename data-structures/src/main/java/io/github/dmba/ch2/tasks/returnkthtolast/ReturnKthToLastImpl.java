package io.github.dmba.ch2.tasks.returnkthtolast;

import io.github.dmba.common.linkedlist.Node;

public class ReturnKthToLastImpl<T> implements ReturnKthToLast<T> {
    @Override
    public Node<T> findKthToLast(Node<T> head, int k) {
        if (k < 0) {
            throw new IndexOutOfBoundsException();
        }
        return head == null ? null : findKthToLastInternal(head, k);
    }

    private Node<T> findKthToLastInternal(Node<T> head, int k) {
        Node<T> runner = head;

        while (runner != null) {
            if (k == 0) {
                break;
            }

            runner = runner.next;
            k = k - 1;
        }

        if (k != 0) {
            throw new IndexOutOfBoundsException();
        }

        return runner;
    }
}
