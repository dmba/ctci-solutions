package io.github.dmba.ch1.tasks.q12checkpermutation;

public class IsPermutationHashTableTest implements IsPermutationTest {
    @Override
    public IsPermutation createPredicate(String source) {
        return new IsPermutationHashTableImpl(source);
    }
}
