package io.github.dmba.ch1.tasks.q12checkpermutation;

import java.util.HashMap;

public class IsPermutationHashTableImpl implements IsPermutation {
    private final String source;

    public IsPermutationHashTableImpl(String source) {
        this.source = source;
    }

    @Override
    public boolean test(String target) {
        return source != null
                && target != null
                && source.length() == target.length()
                && testInternal(target);
    }

    private boolean testInternal(String target) { // O(N)
        CounterHashMap<Character> map = new CounterHashMap<>();

        for (int i = 0; i < source.length(); i++) { // O(N)
            char c = source.charAt(i); // O(1)
            map.increment(c); // O(1)
        }

        for (int i = 0; i < target.length(); i++) { // O(N)
            char c = target.charAt(i); // O(1)
            if (map.getCount(c) > 0) { // O(1)
                map.decrement(c); // O(1)
            } else {
                return false;
            }
        }

        return true;
    }
}

class CounterHashMap<K> extends HashMap<K, Integer> {
    void increment(K key) {
        this.put(key, this.containsKey(key) ? this.get(key) + 1 : 1);
    }

    void decrement(K key) {
        this.put(key, this.containsKey(key) ? this.get(key) - 1 : 0);
    }

    int getCount(K key) {
        return this.getOrDefault(key, -1);
    }
}
