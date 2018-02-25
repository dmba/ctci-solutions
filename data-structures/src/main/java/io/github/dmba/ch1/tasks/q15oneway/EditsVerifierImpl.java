package io.github.dmba.ch1.tasks.q15oneway;

public class EditsVerifierImpl implements EditsVerifier {

    @Override
    public boolean isAtMostOneEditAway(String first, String second) {
        return first != null && second != null && isAtMostOneEditAwayInternal(first, second);
    }

    private boolean isAtMostOneEditAwayInternal(String first, String second) {
        if (first.length() == second.length()) {
            return isOneEditReplace(first, second);
        }
        if (first.length() + 1 == second.length()) {
            return isOneEditInsert(first, second);
        }
        if (first.length() - 1 == second.length()) {
            return isOneEditInsert(second, first);
        }
        return false;
    }

    private boolean isOneEditInsert(String first, String second) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < second.length() && index1 < first.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean isOneEditReplace(String first, String second) {
        boolean foundDifference = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}
