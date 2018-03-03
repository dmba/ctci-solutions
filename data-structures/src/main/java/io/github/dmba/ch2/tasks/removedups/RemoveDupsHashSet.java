package io.github.dmba.ch2.tasks.removedups;

import io.github.dmba.common.linkedlist.Node;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsHashSet<T> implements RemoveDups<T> {
    @Override
    public void removeDups(Node<T> head) {
        final Set<T> set = new HashSet<>();

        Node<T> runner = head;
        while (runner != null) {
            if (set.contains(runner.data)) {
                head = Node.removeNode(head, runner);
            } else {
                set.add(runner.data);
            }
            runner = runner.next;
        }
    }
}
