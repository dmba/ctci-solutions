package io.github.dmba.linkedlist;

import io.github.dmba.common.linkedlist.Node;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class NodeChainAssert extends AbstractAssert<NodeChainAssert, Node> {
    private NodeChainAssert(Node actual) {
        super(actual, NodeChainAssert.class);
    }

    public <T> void isHeadOfSequence(T... data) {
        Node<T> runner = this.actual;
        for (T item : data) {
            Assertions.assertThat(runner).isNotNull();
            Assertions.assertThat(runner.data).isEqualTo(item);
            runner = runner.next;
        }
    }

    public static NodeChainAssert assertThat(Node node) {
        return new NodeChainAssert(node);
    }
}
