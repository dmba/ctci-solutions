package io.github.dmba.ch2.tasks.removedups;

public class RemoveDupsNoHelperMethodTest implements RemoveDupsTest {
    @Override
    public RemoveDups<String> createRemoveDups() {
        return new RemoveDupsNoHelperMethod<>();
    }
}
