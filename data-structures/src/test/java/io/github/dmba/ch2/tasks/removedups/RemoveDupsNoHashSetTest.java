package io.github.dmba.ch2.tasks.removedups;

public class RemoveDupsNoHashSetTest implements RemoveDupsTest {
    @Override
    public RemoveDups<String> createRemoveDups() {
        return new RemoveDupsNoHashSet<>();
    }
}
