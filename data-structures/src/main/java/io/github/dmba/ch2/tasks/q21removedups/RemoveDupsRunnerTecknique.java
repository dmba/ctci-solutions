package io.github.dmba.ch2.tasks.q21removedups;

import io.github.dmba.common.linkedlist.Node;

public class RemoveDupsRunnerTecknique<T> implements RemoveDups<T> {
    @Override
    public void removeDups(Node<T> head) {
        if (head == null) {
            return;
        }

        Node<T> previous = head;
        Node<T> current = previous.next;

        while (current != null) {
            Node<T> runner = head;

            while (runner != current) {
                if (current.data.equals(runner.data)) {
                    previous.next = current.next;
                    current = current.next;
                    break;
                }

                runner = runner.next;
            }

            if (runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }
}
