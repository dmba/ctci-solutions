package io.github.dmba.ch2.tasks.q23deletemiddlenode;

import io.github.dmba.common.linkedlist.Node;

public class DeleteMiddleNodeRunnerTechnique<T> implements DeleteMiddleNode<T> {
    @Override
    public void deleteMiddleNode(Node<T> head) {
        if (head != null && head.next != null && head.next.next != null) {
            deleteMiddleNodeInternal(head);
        }
    }

    private void deleteMiddleNodeInternal(Node<T> head) {
        Node<T> runner = head;
        Node<T> fastRunner = head;

        while (fastRunner != null) {
            if (fastRunner.next != null) {
                fastRunner = fastRunner.next.next;
                runner = runner.next;
            } else {
                fastRunner = null;
            }
        }

        Node.removeNode(head, runner);
    }
}
