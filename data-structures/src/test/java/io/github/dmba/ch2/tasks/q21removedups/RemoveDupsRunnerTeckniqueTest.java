package io.github.dmba.ch2.tasks.q21removedups;

public class RemoveDupsRunnerTeckniqueTest implements RemoveDupsTest {
    @Override
    public RemoveDups<String> createRemoveDups() {
        return new RemoveDupsRunnerTecknique<>();
    }
}
