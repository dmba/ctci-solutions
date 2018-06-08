package io.github.dmba.ch2.tasks.q22returnkthtolast;

import io.github.dmba.common.linkedlist.Node;

public interface ReturnKthToLast<T> {
    Node<T> findKthToLast(Node<T> head, int k);
}
