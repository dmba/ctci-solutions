package io.github.dmba.linkedlist;

import io.github.dmba.common.linkedlist.Node;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class NodeTestHelper {
    public static <T> Node<T> chainNodes(T... data) {
        final List<Node<T>> list = Stream.of(data)
                .map(Node::of)
                .collect(toList());
        return chainNodes(0, list);
    }

    public static <T> Node<T> chainNodes(Node<T>... nodes) {
        final List<Node<T>> list = Stream.of(nodes)
                .collect(toList());
        return chainNodes(0, list);
    }

    private static <T> Node<T> chainNodes(int index, List<Node<T>> nodes) {
        if (nodes.isEmpty()) {
            return null;
        }
        final Node<T> node = nodes.get(index);
        if (index < nodes.size() - 1) {
            node.next = chainNodes(index + 1, nodes);
        }
        return node;
    }
}
