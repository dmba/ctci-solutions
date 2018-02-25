package io.github.dmba.ch1.tasks.q11isunique;

public class IsUniqueNoAdditionalDas implements IsAllUniqueChars {
    @Override
    public boolean test(String str) {
        return str == null || str.isEmpty() || testInternal(str);
    }

    private boolean testInternal(String str) {
        for (int i = 0; i < str.length(); ++i) {
            char current = str.charAt(i);
            for (int j = i + 1; j < str.length(); ++j) {
                if (current == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
