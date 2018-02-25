package io.github.dmba.ch1.tasks.q11isunique;

public class IsUniqueWithSetTest implements IsAllUniqueCharsTest {
    @Override
    public IsAllUniqueChars createPredicate() {
        return new IsUniqueWithSet();
    }
}
