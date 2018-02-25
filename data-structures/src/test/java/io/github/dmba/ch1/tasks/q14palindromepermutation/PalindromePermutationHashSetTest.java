package io.github.dmba.ch1.tasks.q14palindromepermutation;

public class PalindromePermutationHashSetTest implements PalindromePermutationTest {
    @Override
    public PalindromePermutation createPermutationChecker() {
        return new PalindromePermutationHashSet();
    }
}
