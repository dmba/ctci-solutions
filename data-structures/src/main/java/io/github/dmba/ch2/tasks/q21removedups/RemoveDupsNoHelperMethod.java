package io.github.dmba.ch2.tasks.q21removedups;

import io.github.dmba.common.linkedlist.Node;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsNoHelperMethod<T> implements RemoveDups<T> {
    @Override
    public void removeDups(Node<T> head) {
        final Set<T> set = new HashSet<>();

        Node<T> runner = head;
        Node<T> prev = null;
        while (runner != null) {
            if (set.contains(runner.data)) {
                prev.next = runner.next;
            } else {
                set.add(runner.data);
                prev = runner;
            }
            runner = runner.next;
        }
    }
}
