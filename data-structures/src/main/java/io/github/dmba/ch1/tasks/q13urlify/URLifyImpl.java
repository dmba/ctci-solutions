package io.github.dmba.ch1.tasks.q13urlify;

public class URLifyImpl implements URLify {
    private static final char SPACE = ' ';
    private static final String SPACE_REPLACE = "%20";

    @Override
    public String urlify(String str, int charsCount) {
        return str != null && charsCount <= str.length() ? urlifyInternal(str, charsCount) : null;
    }

    private String urlifyInternal(String str, int charsCount) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charsCount; i++) {
            if (SPACE == str.charAt(i)) {
                builder.append(SPACE_REPLACE);
            } else {
                builder.append(str.charAt(i));
            }
        }

        return builder.toString();
    }
}
