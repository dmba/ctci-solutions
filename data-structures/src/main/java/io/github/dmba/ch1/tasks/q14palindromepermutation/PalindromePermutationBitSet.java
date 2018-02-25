package io.github.dmba.ch1.tasks.q14palindromepermutation;

import java.util.BitSet;

public class PalindromePermutationBitSet implements PalindromePermutation {
    @Override
    public boolean isPalindromePermutation(String str) {
        return str != null && (str.isEmpty() || isPalindromePermutationInternal(str));
    }

    private boolean isPalindromePermutationInternal(String str) { // O(N)
        str = normalize(str);

        BitSet bitSet = new BitSet();
        for (char c : str.toCharArray()) {
            bitSet.flip(c - 'a');
        }

        return bitSet.cardinality() < 2;
    }

    private String normalize(String str) {
        return str.replaceAll(" ", "").toLowerCase();
    }
}

