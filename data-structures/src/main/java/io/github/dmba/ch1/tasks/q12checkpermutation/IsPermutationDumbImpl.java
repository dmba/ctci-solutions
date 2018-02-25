package io.github.dmba.ch1.tasks.q12checkpermutation;

import java.util.Arrays;

public class IsPermutationDumbImpl implements IsPermutation {
    private final String source;

    public IsPermutationDumbImpl(String source) {
        this.source = source;
    }

    @Override
    public boolean test(String target) {
        return source != null
                && target != null
                && source.length() == target.length()
                && testInternal(target);
    }

    private boolean testInternal(String target) { // O(N log N)
        char[] sourceArr = source.toCharArray();
        char[] targetArr = target.toCharArray();
        Arrays.sort(sourceArr); // quicksort O(N log N)
        Arrays.sort(targetArr); // quicksort O(N log N)
        return Arrays.equals(sourceArr, targetArr); // O(N)
    }
}
