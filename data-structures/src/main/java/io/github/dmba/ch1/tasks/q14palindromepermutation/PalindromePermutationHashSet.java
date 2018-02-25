package io.github.dmba.ch1.tasks.q14palindromepermutation;

import java.util.HashSet;

public class PalindromePermutationHashSet implements PalindromePermutation {
    @Override
    public boolean isPalindromePermutation(String str) {
        return str != null && (str.isEmpty() || isPalindromePermutationInternal(str));
    }

    private boolean isPalindromePermutationInternal(String str) { // O(N)
        str = normalize(str);

        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return set.isEmpty() || set.size() == 1;
    }

    private String normalize(String str) {
        return str.replaceAll(" ", "").toLowerCase();
    }
}

