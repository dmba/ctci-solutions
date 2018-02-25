package io.github.dmba.ch1.tasks.q14palindromepermutation;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationHashMap implements PalindromePermutation {
    @Override
    public boolean isPalindromePermutation(String str) {
        return str != null && (str.isEmpty() || isPalindromePermutationInternal(str));
    }

    private boolean isPalindromePermutationInternal(String str) { // O(N)
        str = normalize(str);

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int oddCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }

        return true;
    }

    private String normalize(String str) {
        return str.replaceAll(" ", "").toLowerCase();
    }
}
