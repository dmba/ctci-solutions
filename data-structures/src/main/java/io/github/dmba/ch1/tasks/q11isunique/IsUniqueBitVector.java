package io.github.dmba.ch1.tasks.q11isunique;

import java.util.BitSet;

public class IsUniqueBitVector implements IsAllUniqueChars {
    @Override
    public boolean test(String str) {
        return str == null || str.isEmpty() || testInternal(str);
    }

    private boolean testInternal(String str) {
        BitSet bitSet = new BitSet();
        for (char c : str.toCharArray()) {
            int bitIndex = c - 'a';
            if (bitSet.get(bitIndex)) {
                return false;
            }
            bitSet.set(bitIndex);
        }
        return true;
    }
}
