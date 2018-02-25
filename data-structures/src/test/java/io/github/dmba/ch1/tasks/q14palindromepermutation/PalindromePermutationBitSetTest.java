package io.github.dmba.ch1.tasks.q14palindromepermutation;

public class PalindromePermutationBitSetTest implements PalindromePermutationTest {
    @Override
    public PalindromePermutation createPermutationChecker() {
        return new PalindromePermutationBitSet();
    }
}
