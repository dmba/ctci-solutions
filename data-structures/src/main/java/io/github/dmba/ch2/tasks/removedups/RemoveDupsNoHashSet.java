package io.github.dmba.ch2.tasks.removedups;

import io.github.dmba.common.linkedlist.Node;

public class RemoveDupsNoHashSet<T> implements RemoveDups<T> {
    @Override
    public void removeDups(Node<T> head) {
        Node<T> runner = head;
        while (runner != null) {
            Node<T> innerRunner = runner.next;
            while (innerRunner != null) {
                if (runner.data.equals(innerRunner.data)) {
                    head = Node.removeNode(head, innerRunner);
                }
                innerRunner = innerRunner.next;
            }
            runner = runner.next;
        }
    }
}
