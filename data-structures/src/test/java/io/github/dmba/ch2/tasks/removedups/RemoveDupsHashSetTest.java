package io.github.dmba.ch2.tasks.removedups;

public class RemoveDupsHashSetTest implements RemoveDupsTest {
    @Override
    public RemoveDups<String> createRemoveDups() {
        return new RemoveDupsHashSet<>();
    }
}
