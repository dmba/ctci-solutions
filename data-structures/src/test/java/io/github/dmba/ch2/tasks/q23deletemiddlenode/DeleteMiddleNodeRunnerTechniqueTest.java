package io.github.dmba.ch2.tasks.q23deletemiddlenode;

public class DeleteMiddleNodeRunnerTechniqueTest implements DeleteMiddleNodeTest {
    @Override
    public DeleteMiddleNode<String> createImpl() {
        return new DeleteMiddleNodeRunnerTechnique<>();
    }
}
