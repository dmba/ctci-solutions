package io.github.dmba.ch1.tasks.q12checkpermutation;

public class IsPermutationDumbImplTest implements IsPermutationTest {
    @Override
    public IsPermutation createPredicate(String source) {
        return new IsPermutationDumbImpl(source);
    }
}
