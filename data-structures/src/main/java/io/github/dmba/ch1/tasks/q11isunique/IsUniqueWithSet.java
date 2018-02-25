package io.github.dmba.ch1.tasks.q11isunique;

import java.util.Set;
import java.util.TreeSet;

public class IsUniqueWithSet implements IsAllUniqueChars {
    @Override
    public boolean test(String str) {
        return str == null || str.isEmpty() || testInternal(str);
    }

    private boolean testInternal(String str) {
        Set<Character> set = new TreeSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
