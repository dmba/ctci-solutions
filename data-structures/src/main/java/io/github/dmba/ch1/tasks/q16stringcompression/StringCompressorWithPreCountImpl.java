package io.github.dmba.ch1.tasks.q16stringcompression;

public class StringCompressorWithPreCountImpl implements StringCompressor {
    @Override
    public String compress(String str) {
        return str != null ? compressInternal(str) : null;
    }

    private String compressInternal(String original) {
        final int resultingStringSize = countResultingStringSize(original);
        if (resultingStringSize >= original.length()) {
            return original;
        }
        final StringBuilder compressed = new StringBuilder(resultingStringSize);
        int counter = 0;
        for (int i = 0; i < original.length(); i++) {
            counter++;
            if (i + 1 == original.length() || original.charAt(i) != original.charAt(i + 1)) {
                compressed.append(original.charAt(i)).append(counter);
                counter = 0;
            }
        }
        return compressed.toString();
    }

    private int countResultingStringSize(String original) {
        int size = 0;
        int counter = 0;
        for (int i = 0; i < original.length(); i++) {
            counter++;
            if (i + 1 == original.length() || original.charAt(i) != original.charAt(i + 1)) {
                size += 1 + Integer.toString(counter).length();
                counter = 0;
            }
        }
        return size;
    }
}
