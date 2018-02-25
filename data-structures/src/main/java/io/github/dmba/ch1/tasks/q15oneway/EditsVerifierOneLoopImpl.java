package io.github.dmba.ch1.tasks.q15oneway;

public class EditsVerifierOneLoopImpl implements EditsVerifier {

    @Override
    public boolean isAtMostOneEditAway(String first, String second) {
        return first != null && second != null && isAtMostOneEditAwayInternal(first, second);
    }

    private boolean isAtMostOneEditAwayInternal(String first, String second) {
        String str0 = first.length() < second.length() ? first : second;
        String str1 = first.length() < second.length() ? second : first;

        int index0 = 0;
        int index1 = 0;
        boolean foundDifference = false;
        while (index1 < str1.length() && index0 < str0.length()) {
            if (str0.charAt(index0) != str1.charAt(index1)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
                if (str0.length() == str1.length()) {
                    index0++;
                }
            } else {
                index0++;
            }
            index1++;
        }
        return true;
    }
}
