package io.github.dmba.linkedlist;

import io.github.dmba.common.linkedlist.Node;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeChainAssert extends AbstractAssert<NodeChainAssert, Node> {
    private NodeChainAssert(Node actual) {
        super(actual, NodeChainAssert.class);
    }

    public <T> void isHeadOfSequence(T... data) {
        Node<T> runner = this.actual;
        for (T item : data) {
            assertThat(runner).isNotNull();
            assertThat(runner.data).isEqualTo(item);
            runner = runner.next;
        }
    }

    public void hasData(Object data) {
        assertThat(this.actual.data).isEqualTo(data);
    }

    public static NodeChainAssert assertThatNode(Node node) {
        return new NodeChainAssert(node);
    }

}
